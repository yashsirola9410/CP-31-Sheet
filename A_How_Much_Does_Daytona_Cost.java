import java.util.*;


public class A_How_Much_Does_Daytona_Cost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int t = sc.nextInt(); 

        while(t-- > 0){
           //input for each test case 
           int n = sc.nextInt();
           int k = sc.nextInt();
           
           int arr[] = new int[n];

           for(int i = 0; i< n ; i++){
                 arr[i] = sc.nextInt();
           }
           
           boolean found = false ;
           for(int i = 0 ;i< n ; i++){
            if(arr[i] ==  k){
                found = true ;
                break;
            }
           }

            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
                
        }
    }
}