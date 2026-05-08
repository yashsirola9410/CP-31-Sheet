import java.util.*;
import java.io.*;

public class DPalindromex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] v = new int[2 * n];
            
            int a = -1, b = -1;
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 2 * n; i++) {
                v[i] = Integer.parseInt(st.nextToken());
                if (v[i] == 0) {
                    if (a == -1) a = i;
                    else b = i;
                }
            }

            int res = 0;

            res = Math.max(res, eval(v, a, a, n));
            res = Math.max(res, eval(v, b, b, n));

            int l = (a + b) / 2;
            int r = (a + b + 1) / 2;
            res = Math.max(res, eval(v, l, r, n));

            sb.append(res).append("\n");
        }
        System.out.print(sb);
    }

    private static int eval(int[] v, int i, int j, int n) {
        while (i >= 0 && j < v.length && v[i] == v[j]) {
            i--;
            j++;
        }
        
        i++;
        j--;

        if (i > j) return 0;

        boolean[] f = new boolean[n + 1];
        for (int k = i; k <= j; k++) {
            if (v[k] <= n) {
                f[v[k]] = true;
            }
        }

        for (int k = 0; k <= n; k++) {
            if (!f[k]) return k;
        }
        
        return n + 1;
    }
}