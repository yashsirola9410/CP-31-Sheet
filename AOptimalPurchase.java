import java.util.*;

public class AOptimalPurchase{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
     int t = sc.nextInt();

     while(t-- > 0){
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();


            long groups = n / 3;
            long rem = n % 3;


            long answer = groups * Math.min(b, 3 * a);

            answer += Math.min(rem * a, b);
            System.out.println(answer);
     }
   }
}