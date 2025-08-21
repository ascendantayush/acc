import java.util.*;

public class toggle{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n ;
        n = cin.nextInt();

        int[] arr = new int[n+1];

        for(int i = 1 ; i < arr.length  ; i++){
            for(int j = i ; j < arr.length ; j= j + i){
                if(arr[j] == 0){
                    arr[j] = 1;
                }else{
                    arr[j] = 0;
                }
            }
        }


        int count = 0 ;

        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] == 1){
                count++;
            }
        }


        System.out.println(count);
    }
}