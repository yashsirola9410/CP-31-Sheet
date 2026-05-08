import java.util.*;

public class BSequenceGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            //input taken 
            for(int i = 0; i< n ; i++){
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();

            ans.add(arr[0]);
            for(int i = 1 ; i< n ; i++){
                if(arr[i-1] <= arr[i]){
                    ans.add(arr[i]);
                }else{
                    ans.add(arr[i]);
                    ans.add(arr[i]);
                }
            }
            
            System.out.println(ans.size());

            for(int i = 0 ; i<ans.size() ; i++){
                System.out.print(ans.get(i)+ " ");
            }
            System.out.println();
        }
    }
}