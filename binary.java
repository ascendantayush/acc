import java.util.*;

public class binary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String bin = Integer.toBinaryString(n); // convert int → binary string
        boolean ans = true;
        int l = 0 ;
        int r = bin.length() - 1;

        while( l  <  r){
            char a = bin.charAt(l);
            char b = bin.charAt(r);


            if( a == b){
                l++;
                r--;
            }else{
                ans = false;
                break;
            }

            
        }

        System.out.println(ans);




    }
}
