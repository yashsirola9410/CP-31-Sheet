import java.util.*;

public class AWalkingMaster{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
   long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            long p = d - b;  
            long q = a + d - b - c;  

            if (p < 0 || q < 0) {
                System.out.println(-1);
            }
             else {
                System.out.println(p + q);
            }
        }
    }
}