import java.util.*;

public class C1SeatingArrangementEasyVersion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();
            String u = sc.next();

            int dp[] = new int[x + 1];
            Arrays.fill(dp, -1);
            dp[0] = 0;

            for (int i = 0; i < n; i++) {
                char c = u.charAt(i);
                int ndp[] = dp.clone();

                for (int j = 0; j <= x; j++) {
                    if (dp[j] == -1) continue;

                    int k = dp[j];
                    int e = x - j;
                    int p = j * s - k;

                    if ((c == 'I' || c == 'A') && e > 0) {
                        ndp[j + 1] = Math.max(ndp[j + 1], k + 1);
                    }
                    if ((c == 'E' || c == 'A') && p > 0) {
                        ndp[j] = Math.max(ndp[j], k + 1);
                    }
                }
                dp = ndp;
            }
            int ans = 0;

            for (int j = 0; j <= x; j++) {
                ans = Math.max(ans, dp[j]);
            }
            System.out.println(ans);
        }
    }
}