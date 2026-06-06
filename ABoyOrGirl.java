import java.util.*;

public class ABoyOrGirl{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean vis[] = new boolean[26];

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            vis[c-'a'] = true;
        }

        int count = 0 ;

        for(int i = 0 ; i < 26 ; i++){
            if(vis[i]){
                count++;
            }
        }

        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}