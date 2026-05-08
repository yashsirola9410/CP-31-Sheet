import java.util.*;

public class AUnitedWeStand{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];

            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c= new ArrayList<>();

            for(int i = 0 ; i< n ; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int min = a[0];

            int i = 0; 

            while(i<n){
                if(min != a[i]){
                    break;
                }
                else{
                   b.add(a[i]); 
                }
                i++;
            }

            while(i < n){
                c.add(a[i]);
                i++;
            }

            if(c.size() == 0){
                System.out.println(-1);
            }else{
                 System.out.print(b.size()+ " " + c.size());
            System.out.println();
            =z
            for(int j = 0 ; j< b.size() ; j++){
                System.out.print(b.get(j)+" ");
            }
            System.out.println();
             for(int j = 0 ; j< c.size() ; j++){
                System.out.print(c.get(j)+" ");
            }
             System.out.println();
            }
           
        }
    }
}