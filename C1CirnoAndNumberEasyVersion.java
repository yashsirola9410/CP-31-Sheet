import java.util.*;
import java.math.BigInteger;

public class C1CirnoAndNumberEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            String s = sc.next();
            int n = sc.nextInt();
            long d1 = sc.nextLong();
            long d2 = sc.nextLong();
            
            if (d1 > d2) {
                long tmp = d1;
                d1 = d2;
                d2 = tmp;
            }
            
            BigInteger X = new BigInteger(s);
            int L = s.length();
            ArrayList<BigInteger> c = new ArrayList<>();
            
            if (L > 1) {
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < L - 1; i++) b.append(d2);
                c.add(new BigInteger(b.toString()));
            }
            
            long f = (d1 > 0) ? d1 : d2;
            StringBuilder b2 = new StringBuilder().append(f);
            for (int i = 0; i < L; i++) b2.append(d1);
            c.add(new BigInteger(b2.toString()));
            
            for (int k = 0; k <= L; k++) {
                String pre = s.substring(0, k);
                boolean ok = true;
                
                for (int i = 0; i < pre.length(); i++) {
                    long cur = pre.charAt(i) - '0';
                    if (cur != d1 && cur != d2) {
                        ok = false;
                        break;
                    }
                }
                if (!ok) continue;
                
                if (k == L) {
                    c.add(X);
                    continue;
                }
                
                int ak = s.charAt(k) - '0';
                
                if (!(k == 0 && L > 1 && d1 == 0)) {
                    StringBuilder t1 = new StringBuilder(pre).append(d1);
                    if (d1 < ak) {
                        for (int i = 0; i < L - 1 - k; i++) t1.append(d2);
                    } else if (d1 > ak) {
                        for (int i = 0; i < L - 1 - k; i++) t1.append(d1);
                    } else {
                        t1 = null;
                    }
                    if (t1 != null) c.add(new BigInteger(t1.toString()));
                }
                
                if (!(k == 0 && L > 1 && d2 == 0)) {
                    StringBuilder t2 = new StringBuilder(pre).append(d2);
                    if (d2 < ak) {
                        for (int i = 0; i < L - 1 - k; i++) t2.append(d2);
                    } else if (d2 > ak) {
                        for (int i = 0; i < L - 1 - k; i++) t2.append(d1);
                    } else {
                        t2 = null;
                    }
                    if (t2 != null) c.add(new BigInteger(t2.toString()));
                }
            }
            
            if (d1 == 0 || d2 == 0) {
                c.add(BigInteger.ZERO);
            }
            
            BigInteger ans = null;
            for (BigInteger b : c) {
                BigInteger diff = X.subtract(b).abs();
                if (ans == null || diff.compareTo(ans) < 0) {
                    ans = diff;
                }
            }
            out.append(ans).append("\n");
        }
        
        System.out.print(out);
    }
}