import java.util.*;

public class BLongestDivisorsInterval {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long curLcm = 1;
            int ans = 0;

            for (int i = 1; ; i++) {

                long g = gcd(curLcm, i);

                if (curLcm > n / (i / g))
                    break;

                curLcm = curLcm * (i / g);

                if (n % curLcm == 0)
                    ans = i;
                else
                    break;
            }

            System.out.println(ans);
        }
    }
}