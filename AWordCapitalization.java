import java.util.*;

public class AWordCapitalization{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();

        String ans = "";

        char c = Character.toUpperCase(s.charAt(0));
        ans += c;
        ans += s.substring(1,s.length());
        System.out.println(ans);

    }
}