import java.util.*;

public class BPermutationSwap{
      static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int ans = 0;
            for(int i = 1 ; i <= n ;i++){
                int x = sc.nextInt();
                ans = gcd(ans , Math.abs(x - i));
            }

            System.out.println(ans);
        }
        sc.close();

    }
}