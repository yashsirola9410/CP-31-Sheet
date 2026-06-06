import java.util.*;

public class AJellyfishAndUndertale{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t--  > 0 ){
            long a =sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long ans =b ;
            for(int i = 0 ; i< n ; i++){
                long p = sc.nextLong();

                ans+= Math.min(p , a-1);
            }
            
            System.out.println(ans);
        }
    }
}