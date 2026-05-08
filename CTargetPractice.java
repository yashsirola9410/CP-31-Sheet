import java.util.*;

public class CTargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int total = 0;

            for (int i = 0; i < 10; i++) {
                String s = sc.next();

                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) == 'X') {
                        int dist = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        total += dist + 1;
                    }
                }
            }

            System.out.println(total);
        }
    }
}