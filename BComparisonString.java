import java.util.*;

public class BComparisonString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int count = 1 ;
            int max = 1;

            for(int i = 1 ; i<n ; i++){
                if(s.charAt(i) == s.charAt(i-1)){
                    count++;
                }else{
                    count = 1;
                }
                max = Math.max(count , max);
            }
            System.out.println(max + 1);
        }
    }
}