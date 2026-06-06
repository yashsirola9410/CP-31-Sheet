import java.util.*;

public class AExtremelyRound{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int ans = 0;
            while(n >0){
                ans += Math.min(9, n);
                n /= 10;
            }

            System.out.println(ans);
        }
    }
}