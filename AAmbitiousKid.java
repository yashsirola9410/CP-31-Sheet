import java.util.*;

public class AAmbitiousKid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i< n  ;i++){
            int ans = Math.abs(arr[i]) - 0;
            min = Math.min(ans , min);
        }
        System.out.println(min);

    }
}