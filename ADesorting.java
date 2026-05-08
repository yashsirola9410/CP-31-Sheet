import java.util.*;

public class ADesorting{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();
        int diff = 0;

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            boolean notsorted = false;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i <n-1 ; i++){
                if(arr[i] > arr[i+1]){
                    notsorted = true ;
                    break;
                }
                    diff = Math.abs(arr[i] - arr[i+1]);
                    min = Math.min(min , diff);
            }

            if(notsorted){
                System.out.println(0);
            }else{
               System.out.println((min/2)+1);
            }
        }
    }
}