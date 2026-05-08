import java.util.*;

public class AUnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
                    int n = sc.nextInt();

            int counta = 0;
            int countb = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == -1) countb++;
                else counta++;
            }

            int ops = 0;

    
            if (countb % 2 == 1) {
                ops++;
                countb--;
                counta++;
            }

            while (counta < countb) {
                ops++;
                countb--;
                counta++;
            }

            if (countb % 2 == 1) {
                ops++;
            }

            System.out.println(ops);
        }
    }
}