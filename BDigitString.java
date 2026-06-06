import java.util.*;

public class BDigitString{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
    
     int t = sc.nextInt();

     while(t-- > 0){
          String s = sc.next();
            char ch[] = s.toCharArray();
            int n = ch.length;
            
            int c13 = 0;
            for (int i= 0 ; i < ch.length ; i++) {
                if (ch[i] == '1' || ch[i] == '3') {
                    c13++;
                }
            }
            
            int maxK = c13;
            int c2 = 0;
            
            for (int i = 0 ; i<ch.length ; i++) {
                char c = ch[i];
                if (c == '2') {
                    c2++;
                } else if (c == '1' || c == '3') {
                    c13--;
                }


                maxK = Math.max(maxK, c2 + c13);
            }
            
            System.out.println(n - maxK);
     }
   }
}