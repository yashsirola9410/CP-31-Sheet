import java.util.*;

public class BNewYearCake{
    public static int counting(int a , int b){
            int inc = 1;
            boolean flipper = false;
            int count = 0;

            while(true){
               if(!flipper){
                  if(a < inc) break;  
                   a = a - inc;
               }else{
                 if(b < inc) break;
                b = b - inc;
               }

               count++;
               inc *= 2;
               flipper = !flipper;
            }
            return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans1 = counting(a , b);
            int ans2 = counting(b , a);


           
            System.out.println(Math.max(ans1 , ans2));
        }
    }
}