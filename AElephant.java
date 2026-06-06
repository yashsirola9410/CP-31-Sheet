import java.util.*;

public class AElephant{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int min = Integer.MAX_VALUE;

         for(int i = 1 ; i <=  5 ; i++){
            int d = n/i;
            if(n%i != 0)d = d + 1;
            min = Math.min(min , d);
         }
         System.out.println(min);
    }
}