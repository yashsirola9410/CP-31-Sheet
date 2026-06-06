import java.util.*;

public class AOneAndTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[]= new int[n];

            for(int i = 0 ; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            int two = 0 ;
            int one = 0 ;

            for(int i = 0; i< n ; i++){
                if(arr[i] == 2){
                   two++;
                }else{
                    one++;
                }
            }

            int c = 0;
            if(two % 2 ==  0 && two > 1){
               for(int i = 0  ; i< n ;i++){
                    if(arr[i] == 2){
                        c++;
                        if(c == two /2){
                           System.out.println(i+1);
                           break;
                        }  
                    }
               }
            }
            else if(one == n && two == 0){
                System.out.println(1);
            } else{
                System.out.println(-1);
            }

        }
    }
}

