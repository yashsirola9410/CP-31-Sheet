import java.io.*;
import java.util.*;

public class CZhilyAndBracketSwapping {

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();

            String s2 = sc.next();

            int b1 = 0;
            int b2 = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);

                if (c1 == c2) {
                    if (c1 == '(') {
                        b1++;
                        b2++;
                    } else {
                        b1--;
                        b2--;
                    }
                } else {
                    if (b1 < b2) {
                        b1++;
                        b2--;
                    } else {
                        b1--;
                        b2++;
                    }
                }

                if (b1 < 0 || b2 < 0) {
                    ok = false;
                    break;
                }
            }

            if (ok && b1 == 0 && b2 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
        out.close();
    }



    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }



        String next() {
            while (st == null ||   !st.hasMoreElements()) {
                try {
                    st =   new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}