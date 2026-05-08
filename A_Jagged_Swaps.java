import java.util.*;

public class A_Jagged_Swaps{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int t = sc.nextInt(); 

        while(t-- > 0){
           //input for each test case 
           int n = sc.nextInt();
           int arr[] = new int[n];
           
           //input for the array 
           for(int i  = 0 ;i< n ; i++){
            arr[i] = sc.nextInt();
           }
           

           int sample[] = arr.clone();
           Arrays.sort(sample);

           int smallest  = sample[0];
           int largest = sample[n-1];
           
           if(arr[0] != smallest  || largest != arr.length){
            System.out.println("NO");
           }else{
            System.out.println("YES");
           }
           
        }
       
    }
}