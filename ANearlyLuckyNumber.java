import java.util.*;
public class ANearlyLuckyNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        boolean lucky = count > 0;

        while (count > 0) {
            int digit = count % 10;
            if (digit != 4 && digit != 7) {
                lucky = false;
                break;
            }
            count /= 10;
        }

        System.out.println(lucky ? "YES" : "NO");
    }
}