import java.util.*;

public class A_A_Number_Between_Two_Others{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int t = sc.nextInt(); 

        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            if( 2* x < y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
       
    }
}