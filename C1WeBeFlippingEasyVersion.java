import java.util.*;

public class C1WeBeFlippingEasyVersion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder(); 
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            ArrayList<Integer> ans = new ArrayList<>();
            int count = 0;
            
            for (int i = n - 1; i >= 0; i--) {
                int val = arr[i];
                if (count % 2 == 1) {
                    val = -val;
                }
                if (val > 0) {
                    ans.add(i + 1);
                    count++;
                }
            }
            
           
            out.append(ans.size()).append("\n");
            
            for (int i = 0; i < ans.size(); i++) {
                out.append(ans.get(i)).append(i == ans.size() - 1 ? "" : " ");
            }
            out.append("\n"); 
        }
        
        System.out.print(out);
    }
}