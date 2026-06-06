import java.util.*;

public class C2WeBeFlippingHardVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n + 2];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            long INF = (long)1e18;
            long[][][] dp = new long[n + 2][2][2];
            int[][][] preP = new int[n + 2][2][2];
            int[][][] preHf = new int[n + 2][2][2];
            int[][][] choice = new int[n + 2][2][2];

            for (int i = 0; i <= n + 1; i++) {
                for (int j = 0; j < 2; j++) {
                    Arrays.fill(dp[i][j], -INF);
                }
            }
            dp[n + 1][0][0] = 0;

            for (int i = n; i >= 1; i--) {
                for (int p = 0; p < 2; p++) {
                    for (int hf = 0; hf < 2; hf++) {
                        if (dp[i + 1][p][hf] == -INF) continue;

                        long v0 = (p == 1) ? -a[i] : a[i];
                        if (dp[i + 1][p][hf] + v0 > dp[i][p][hf]) {
                            dp[i][p][hf] = dp[i + 1][p][hf] + v0;
                            preP[i][p][hf] = p;
                            preHf[i][p][hf] = hf;
                            choice[i][p][hf] = 0;
                        }

                        if (hf == 0 && a[i] < 0) continue;
                        
                        int np = p ^ 1;
                        long v1 = (np == 1) ? -a[i] : a[i];
                        if (dp[i + 1][p][hf] + v1 > dp[i][np][1]) {
                            dp[i][np][1] = dp[i + 1][p][hf] + v1;
                            preP[i][np][1] = p;
                            preHf[i][np][1] = hf;
                            choice[i][np][1] = 1;
                        }
                    }
            }
            }

            int bp = 0, bhf = 0;
            long mx = -INF;
            for (int p = 0; p < 2; p++) {
                for (int hf = 0; hf < 2; hf++) {
                    if (dp[1][p][hf] > mx) {
                        mx = dp[1][p][hf];
                        bp = p;
                        bhf = hf;
                    }
                }
            }

            boolean[] flip = new boolean[n + 2];
            int cp = bp, chf = bhf;
            for (int i = 1; i <= n; i++) {
                if (choice[i][cp][chf] == 1) {
                    flip[i] = true;
                }
                int nxtP = preP[i][cp][chf];
                int nxtHf = preHf[i][cp][chf];
                cp = nxtP;
                chf = nxtHf;
            }

            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (flip[i] && flip[i + 1] && a[i] < 0 && a[i + 1] > 0) {
                    ans.add(i + 1);
                    ans.add(i);
                    i++;
                } else if (flip[i]) {
                    ans.add(i);
                }
            }

            System.out.println(ans.size());
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}