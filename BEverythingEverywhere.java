import java.util.*;

public class BEverythingEverywhere {

   static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                int g = 0, min = a[i], max = a[i];

                for (int j = i; j < n; j++) {
                    g = gcd(g, a[j]);
                    min = Math.min(min, a[j]);
                    max = Math.max(max  , a[j]);

                    if (max - min == g) ans++;

                    if (g == 1 && max - min > 1) break;
                }
            }

            System.out.println(ans);
        }
    }
}