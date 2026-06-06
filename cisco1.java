import java.util.*;

public class cisco1{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i = 0 ; i< n ; i++){
        arr[i] = sc.nextInt();
    }

    int ans = 0;
    int min  =  0;
    int prefixsum = 0;
     
    for(int i = 0; i<n; i++){
        prefixsum+= arr[i];
        min = Math.min(min , prefixsum);
    }
    System.out.println(Math.abs(min));
} 
}