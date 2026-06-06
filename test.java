import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int D = sc.nextInt();
        int H = sc.nextInt();
        int S = sc.nextInt();
        int E1 = sc.nextInt();
        int E2 = sc.nextInt();

        int source = 0;
        int hubInOffset = D;
        int hubOutOffset = D + H;
        int stationOffset = D + 2 * H;
        int sink = D + 2 * H + S + 1;

        int totalNodes = sink + 1;

        int[][] residual = new int[totalNodes][totalNodes];

        List<Integer>[] adj = new ArrayList[totalNodes];
        for (int i = 0; i < totalNodes; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i <= D; i++) {
            int surplus = sc.nextInt();
            addEdge(source, i, surplus, residual, adj);
        }

        for (int i = 1; i <= H; i++) {
            int throughput = sc.nextInt();
            int u = hubInOffset + i;
            int v = hubOutOffset + i;
            addEdge(u, v, throughput, residual, adj);
        }

        for (int i = 1; i <= S; i++) {
            int quota = sc.nextInt();
            int u = stationOffset + i;
            addEdge(u, sink, quota, residual, adj);
        }

        for (int i = 0; i < E1; i++) {
            int depotId = sc.nextInt();
            int hubId = sc.nextInt();
            int capacity = sc.nextInt();

            int u = depotId;
            int v = hubInOffset + hubId;
            addEdge(u, v, capacity, residual, adj);
        }

        for (int i = 0; i < E2; i++) {
            int hubId = sc.nextInt();
            int stationId = sc.nextInt();
            int capacity = sc.nextInt();

            int u = hubOutOffset + hubId;
            int v = stationOffset + stationId;
            addEdge(u, v, capacity, residual, adj);
        }

        System.out.println(edmondsKarp(source, sink, residual, adj, totalNodes));
    }

    private static void addEdge(int u, int v, int capacity,
                                int[][] residual,
                                List<Integer>[] adj) {

        if (residual[u][v] == 0 && residual[v][u] == 0) {
            adj[u].add(v);
            adj[v].add(u);
        }

        residual[u][v] += capacity;
    }

    private static int edmondsKarp(int source, int sink,
                                   int[][] residual,
                                   List<Integer>[] adj,
                                   int totalNodes) {

        int maxFlow = 0;
        int[] parent = new int[totalNodes];

        while (bfs(source, sink, residual, parent, adj)) {

            int pathFlow = Integer.MAX_VALUE;

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, residual[u][v]);
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                residual[u][v] -= pathFlow;
                residual[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    private static boolean bfs(int source, int sink,
                               int[][] residual,
                               int[] parent,
                               List<Integer>[] adj) {

        Arrays.fill(parent, -1);
        parent[source] = source;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {

            int u = queue.poll();

            for (int v : adj[u]) {

                if (parent[v] == -1 && residual[u][v] > 0) {

                    parent[v] = u;

                    if (v == sink) {
                        return true;
                    }

                    queue.add(v);
                }
            }
        }

        return false;
    }
}