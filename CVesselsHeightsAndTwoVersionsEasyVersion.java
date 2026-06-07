import java.util.*;

public class CVesselsHeightsAndTwoVersionsEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int hello[] = new int[n];

            for (int i = 0; i < n; i++) {
                hello[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                long l[] = new long[n];
                long m1 = 0;
                for (int j = 1; j < n; j++) {
                    int e = (i + j - 1) % n;
                    if (hello[e] > m1) m1 = hello[e];
                    l[(i + j) % n] = m1;

                }
                
                long m2 = 0;
                long sum = 0;

                for (int j = 1; j < n; j++) {
                    int p = (i - j + n) % n;
                    if (hello[p] > m2) m2 = hello[p];
                    sum += Math.min(l[p], m2);
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}