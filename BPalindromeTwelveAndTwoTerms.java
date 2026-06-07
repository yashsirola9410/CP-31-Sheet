import java.util.*;

public class BPalindromeTwelveAndTwoTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            run(n);
        }
    }

        static boolean isPal(long x) {
        long r = 0, t = x;
        while (t > 0) {
            r = r * 10 + t % 10;
            t /= 10;
        }
        return r == x;
    }

    static void run(long n) {
        if (n < 100000) {
            for (long b = 0; b <= n; b += 12) {
                long a = n - b;
                if (isPal(a)) {
                    System.out.println(a + " " + b);
                    return;
                }
            }
            System.out.println("-1");
            return;
        }

        int len = String.valueOf(n).length() - 1;
        int v = 0;
        for (int i = 11; i < 100; i++) {
            if (i % 10 != 0 && i % 4 == n % 4) {
                v = i;
                break;
            }
        }

        char[] arr = new char[len];
        Arrays.fill(arr, '0');
        arr[0] = arr[len - 1] = (char) ('0' + (v % 10));
        arr[1] = arr[len - 2] = (char) ('0' + (v / 10));

        int m1 = (len - 1) / 2;
        int m2 = len / 2;

        for (int z = 0; z < 3; z++) {
            arr[m1] = arr[m2] = (char) ('0' + z);
            long s = 0;

            for (char c : arr) s += (c - '0');
            if (s % 3 == n % 3) break;
        }

        long a = Long.parseLong(new String(arr));
        
        System.out.println(a + " " + (n - a));
    }
}