import java.util.*;

public class ASlimesOnALine{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--  > 0 ){
            int n = sc.nextInt();
            int arr[] =  new int[n];

            for(int i = 0 ; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);;
            int min  = arr[0];
            int max= arr[n-1];

            System.out.println((max-min+1) /2);
        }
    }
}