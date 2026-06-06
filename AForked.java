import java.util.*;

public class AForked{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();

            long xK = sc.nextLong();
            long yK = sc.nextLong();

            long xQ = sc.nextLong();
            long yQ = sc.nextLong();

            long[][] moves = {
                    { a,  b},
                    { a, -b},
                    {-a,  b},
                    {-a, -b},
                    { b,  a},
                    { b, -a},
                    {-b,  a},
                    {-b, -a}
            };

            Set<String> king = new HashSet<>();
            Set<String> queen = new HashSet<>();

      
            for (long m[] : moves) {
                long x = xK + m[0];
                long y = yK + m[1];

                king.add(x + "," + y);
            }

            for (long m[] : moves) {
                long x = xQ + m[0];
                long y = yQ + m[1];

                queen.add(x + "," + y);
            }

            int count = 0;


            for (String pos : king) {
                if (queen.contains(pos)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}