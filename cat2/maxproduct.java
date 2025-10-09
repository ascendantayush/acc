import java.util.*;

public class maxproduct {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = cin.nextInt();
        }

        int product = Integer.MIN_VALUE;
        for(int i =0 ; i < arr.length ; i++){
            int ans = 1;
            for(int j = i ; j < arr.length ; j++){
                // int ans = 1;
                // for(int k = i ; k  <= j ; k++){
                //     ans *= arr[k];
                // }

                // product = Math.max(ans,product);
                ans = ans * arr[j];
                product = Math.max(ans,product);

            }
        }


        System.out.println(product);
        
    }
}
