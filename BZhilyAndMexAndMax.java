import java.util.*;

public class BZhilyAndMexAndMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            int a[] = new int[n];

            HashMap<Integer , Integer> map = new HashMap<>();

            int max = 0;

            for(int i = 0 ; i < n ; i++){

                a[i] = sc.nextInt();

                max = Math.max(max , a[i]);

                map.put(a[i] , map.getOrDefault(a[i] , 0) + 1);
            }

            ArrayList<Integer> list = new ArrayList<>();

            list.add(max);
            map.put(max , map.get(max) - 1);

            int mexBuild = 0;

            while(map.getOrDefault(mexBuild , 0) > 0){

                list.add(mexBuild);

                map.put(mexBuild , map.get(mexBuild) - 1);

                mexBuild++;
            }

            ArrayList<Integer> rem = new ArrayList<>(map.keySet());

            Collections.sort(rem , Collections.reverseOrder());

            for(int x : rem){

                int cnt = map.get(x);

                while(cnt-- > 0){
                    list.add(x);
                }
            }

            long ans = 0;

            int mex = 0;
            int prefMax = 0;

            boolean vis[] = new boolean[n + 5];

            for(int x : list){

                prefMax = Math.max(prefMax , x);

                if(x < vis.length){
                    vis[x] = true;
                }

                while(vis[mex]){
                    mex++;
                }

                ans += (long)(mex + prefMax);
            }

            System.out.println(ans);
        }
    }
}