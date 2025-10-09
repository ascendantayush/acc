import java.util.*;

public class gcd {
    public static void main(String[] agrs){
        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int b = cin.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}
