import java.util.*;

public class AArrayColoring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            //logic
            int evenc = 0;
            int oddc = 0;

            //odd even count 
            for(int i = 0 ; i< n ;i++){
                if(arr[i] % 2 == 0){
                    evenc++;
                }else{
                    oddc++;
                }
            }

            if(oddc >= 1  && evenc >=1){
                if(oddc % 2 != 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
            else if(evenc == 0){
                if(oddc % 2 != 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println("YES");
            } 
        }
    }
}