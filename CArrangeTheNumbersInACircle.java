import java.util.Scanner;

public class CArrangeTheNumbersInACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();

            long sum = 0;
            long capP = 0;
            int countP = 0;
            long n1 = 0;
            
            for (int i = 0; i < n; i++) {
                long c = sc.nextLong();
                if (c == 1) {
                    n1++;
                } else if (c >= 2) {
                    countP++;
                    sum += c;
                    capP += (c - 2) / 2;
                }
            }
            
            if (countP == 0) {
                System.out.println(0);
            } else if (countP == 1) {
                long total = sum + Math.min(n1, sum / 2);
                System.out.println(total < 3 ? 0 : total);
            } else {
                System.out.println(sum + Math.min(n1, capP));
            }
        }
    }
}