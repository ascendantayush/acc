import java.util.*;
public class rotate {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = cin.nextInt();
        }

        int k = cin.nextInt();
        k = k % arr.length;
        
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length - 1);
        reverse(arr,0, arr.length - 1);

        for(int i = 0 ; i< arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }

    }

    static void reverse(int[] num,int l, int r){
        while(l < r){
            int temp = num[l];
            num[l] = num[r];
            num[r] = temp;

            l++;
            r--;
        }

        return;
    }
}
