import java.util.Scanner;

public class BCakeLeveling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long min = Long.MAX_VALUE;

            StringBuilder out = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                long a = sc.nextLong();
                sum += a;

                long currentH = sum / i;

                if (currentH < min) {
                    min = currentH;
                }
                out.append(min).append(" ");
            }
            System.out.println(out.toString().trim());
        }
    }
}