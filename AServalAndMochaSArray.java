import java.util.*;

public class AServalAndMochaSArray {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean possible = false;

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    if (gcd(arr[i], arr[j]) <= 2) {
                        possible = true;
                        break;
                    }
                }

                if (possible) break;
            }

            if (possible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}