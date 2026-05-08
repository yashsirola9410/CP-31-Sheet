import java.util.*;

public class A_Don_t_Try_to_Count {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int t = sc.nextInt(); 

        while(t-- > 0){
           //input for each test case 
           int n = sc.nextInt();
           int m = sc.nextInt();
           String s1 = sc.next();
           String s2 = sc.next();

           int count = 0 ; 
           boolean found = false ; 


           for(int i = 0 ; i< 7 ; i++){
              if(s1.contains(s2)){
                System.out.println(count);
                found = true ;
                break ;
              }

              s1 = s1 + s1;
              count++;
           }

           if(!found){
            System.out.println(-1);
           }
        }
    }
}