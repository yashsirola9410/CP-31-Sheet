import java.util.Arrays;
import java.util.Scanner;

public class AConvergence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);

            int ans = n;
            for (int i = 0; i < n; i++) {
                int l = 0, r = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] < a[i]) l++;
                    if (a[j] > a[i]) r++;
                }

                ans = Math.min(ans, Math.max(l, r));
            }

            for (int i = 0; i < n - 1; i++) {
                if (a[i + 1] - a[i] > 1) {

                    int l = i + 1;
                    int r = n - 1 - i;

                    ans = Math.min(ans, Math.max(l, r));
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}