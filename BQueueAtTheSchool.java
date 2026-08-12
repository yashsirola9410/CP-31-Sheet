import java.util.*;

public class BQueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        char[] arr = s.toCharArray();

        for (int sec = 0; sec < t; sec++) {
            int i = 0;

            while (i < n - 1) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i += 2; // skip next position
                } else {
                    i++;
                }
            }
        }

        System.out.println(new String(arr));
    }
}