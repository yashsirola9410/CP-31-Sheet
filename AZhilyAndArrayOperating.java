import java.util.*;

public class AZhilyAndArrayOperating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long[] best = new long[n];

            best[n - 1] = arr[n - 1];

            int ans = 0 ;
            if(best[n-1] > 0){
                ans = 1 ;
            }else{
                ans =0 ;
            }

            for (int i = n - 2; i >= 0; i--) {
                best[i] = Math.max(arr[i], arr[i] + best[i + 1]);
                if (best[i] > 0) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}