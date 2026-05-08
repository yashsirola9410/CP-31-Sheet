import java.util.*;

public class cf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // no of test cases 

       // test cases input 
        while(t-- > 0){

            //input for each test case 
            int n = sc.nextInt();
            String s = sc.next();
            

            char arr[]  = new char[n];

            for(int i = 0 ;i< n ; i++){
                arr[i] = s.charAt(i);
            }
            
            int count = 0;
            int ans = 0;

            //logic
             for(int i = 0; i< n ; i++){
                if(arr[i] == '.') count++; 

                if(i<= n-3 &&
                   arr[i] == '.' &&
                   arr[i+1] == '.' &&
                   arr[i+2] == '.'){
                       ans = 1;
                }
             }

            

             if(ans == 1){
                System.out.println(2);
             }else{
                System.out.println(count);
             }

        }
    }
}
