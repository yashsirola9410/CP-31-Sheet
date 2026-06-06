import java.util.*;

public class APetyaAndStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next(); 

      

        for(int i = 0 ; i< s1.length() ; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
           
           int a = (int)Character.toLowerCase(c1);
           int b = (int)Character.toLowerCase(c2);

           if(a < b){
               System.out.println(-1);
               return;
           } else if (a > b) {
               System.out.println(1);
               return;
           }
        }
         System.out.println(0);
    }
}