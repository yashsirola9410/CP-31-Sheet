
import java.util.*;

public class ADisturbingDistribution {
    static final long MOD = 676767677;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long[] dp = new long[n + 1];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;
            for (int i = 1; i <= n; i++) {
                long product = 1;
                for (int j = i; j >= 1; j--) {

                    if (j < i && arr[j - 1] > arr[j]) break;
                    product = (product * arr[j - 1]) % MOD;

                    dp[i] = Math.min(dp[i], (dp[j - 1] + product) % MOD);
                }
            }

            System.out.println(dp[n]);
        }
    }
}