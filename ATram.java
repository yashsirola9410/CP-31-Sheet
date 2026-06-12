import java.util.*;

public class ATram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            current -= a;
            current += b;

            maxCapacity = Math.max(maxCapacity, current);
        }

        System.out.println(maxCapacity);
    }
}