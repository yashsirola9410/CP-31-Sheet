import java.util.*;

public class ABit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int countp = 0 ;
            int countn = 0 ;
            
            for(int i = 0 ; i < n ;i++){
               String s = sc.next();
               if(s.contains("++")){
                countp++;
               }
               if(s.contains("--")){
                countn++;
               }
            }

            System.out.println(0+countp-countn);

    }
}