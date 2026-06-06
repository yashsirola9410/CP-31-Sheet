import java.io.*;
import java.util.*;

public class BRemiliaPlaysSoku {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());


            long n = Long.parseLong(st.nextToken());
            long x1 = Long.parseLong(st.nextToken());
            long x2 = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            long d = Math.abs(x1 - x2);
            d = Math.min(d, n - d);
            
            if(d == 0) {
                out.append("0\n");
            } else if(k == 0) {
                out.append(d).append("\n");
            } 
            else {
                long rem = Math.min(d, n - d - 2);
                if(rem <= 0) out.append("1\n");
                else out.append(k + rem).append("\n");
         }
        }
        System.out.print(out);
    }
}