import java.util.*;


public class BBlankSpace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0 ; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            //logic
            int max = 0;
            int count = 0 ;
            for(int i = 0 ; i < n ; i++){
              if(arr[i] == 0){
                count++;
                max = Math.max(max , count);
              }else{
                 count = 0;
              }
            }

            System.out.println(max);
        }
    }
}