import java.util.*;

public class BChemistry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            int odd = 0;

            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 == 1) {
                    odd++;
                }
            }

            int remaining = n - k;

        
            if (odd <= k + 1 && remaining >= odd % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}