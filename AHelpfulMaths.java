import java.util.*;

public class AHelpfulMaths{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String arr[] = s.split("\\+");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print("+");
            }
        }

    }
}