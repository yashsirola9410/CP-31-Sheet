import java.util.*;

public class A_Goals_of_Victory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += sc.nextInt();
            }
            
            // missing efficiency
            System.out.println(-sum);
        }
        
        sc.close();
    }
}