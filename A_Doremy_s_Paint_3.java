import java.util.*;

public class A_Doremy_s_Paint_3{
    public static boolean allequal(int arr[]){
       for(int i = 0 ; i< arr.length-1 ; i++){
        if(arr[i] != arr[i+1]){
            return false;
        }
      }
       return true ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       int t = sc.nextInt(); 

        while(t-- > 0){
           //input for each test case 
           int n = sc.nextInt();
           int arr[] = new int[n] ;
           
           //input array elements
           for(int i = 0 ; i < n ; i++){
               arr[i]  = sc.nextInt();
           }

          //logic

          if(n == 2){
             System.out.println("Yes");
             continue;
          }

            //frequency 
            HashMap<Integer , Integer> hm = new HashMap<>();

            for(int x : arr){
                hm.put(x , hm.getOrDefault(x , 0 ) +1);
            }

            //if more then 2 elements then no
            if(hm.size() > 2){
                System.out.println("No");
                continue;
            }

            //if only one element 
            if(hm.size() == 1){
                System.out.println("Yes");
                continue ;
            }

           // if only 2elements 
            List<Integer> freq = new ArrayList<>(hm.values());
            
            if(Math.abs(freq.get(0) - freq.get(1)) <=1 ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}