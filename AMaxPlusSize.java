import java.util.*;

public class AMaxPlusSize{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] =  new int[n];

            for(int i = 0 ; i< n ; i++){
                arr[i] =  sc.nextInt();
            }

            int count1 = 0;
            int count2 = 0;
            int max1 = 0;
            int max2 = 0;
            for(int i = 0 ; i< n ; i = i+2){
                 if(max1 < arr[i]){
                    max1 = arr[i];
                 }
                 count1++;
            }

            for(int i = 1 ; i < n ; i=i+2){
                if(max2 < arr[i]){
                    max2 = arr[i];
                }
                count2++;
            }
            System.out.println(Math.max((max1+count1) ,(max2+ count2)));
        }
    }
}