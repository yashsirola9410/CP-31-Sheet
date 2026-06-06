import java.util.*;

public class AMarisaStealsReimuSTakeout{
           public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    while(t-- > 0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                countzero++;
            }else if(arr[i] == 1){
                countone++;
            }else{
                counttwo++;
            }
        }

        int p = Math.min(countone , counttwo);
        countone = countone - p;
        counttwo  = counttwo- p;

        int ans = countzero + p + ( countone/3 + counttwo/3);
        System.out.println(ans);


    }
           }
}