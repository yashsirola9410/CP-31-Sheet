import java.util.*;

public class AEverybodyLikesGoodArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = sc.nextInt();
            }

            //logic
            int count =  0 ;
            for(int i = 0; i< arr.length-1 ;i++){
                 if(arr[i] % 2 == arr[i+1] % 2){
                     count++;
                 }
            }
            System.out.println(count);
        }
    }
}