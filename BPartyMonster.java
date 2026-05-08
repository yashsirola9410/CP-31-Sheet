import java.util.*;

public class BPartyMonster{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
           
          int n = sc.nextInt();
          String s = sc.next();

          int counta = 0 ; 
          int countb = 0 ;


          for(int i = 0  ; i < n ; i++){
              if(s.charAt(i) == '('){
                counta++;
              }    else{
                countb++;
              }
          }

          if(counta == countb){
            System.out.println("YES");
          }else{
            System.out.println("NO");
          }


    }
}
}