import java.util.*;

public class AWeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int xor = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                xor ^= a[i];
            }

            if (n % 2 == 1) {
                System.out.println(xor);
            } else {
                if (xor != 0) {
                    System.out.println(-1);
                } else {
                    int x = 0;
                    for (int i = 0; i < n - 1; i++) {
                        x ^= a[i];
                    }
                    System.out.println(x);
                }
            }
        }
    }
}