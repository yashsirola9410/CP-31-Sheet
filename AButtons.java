import java.util.*;

public class AButtons{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = 3 ; 
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = 0;
            int k2 = 0 ;

            //logic 
              if(c%2 != 0){
                k = c/2+1; // 5
                k2 = c-k;  //4
            }else{
                k = c/2;
                k2 = c-k;
            }
            
            int asum = a + k;
            int bsum = b + k2;

            if(asum > bsum){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}