import java.util.*;

public class strobo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        if (isStrobogrammatic(num))
            System.out.println("true");
        else
            System.out.println("false");
    }

    static boolean isStrobogrammatic(String num) {
        int l = 0, r = num.length() - 1;

        while (l <= r) {
            char left = num.charAt(l), right = num.charAt(r);

            // valid pairs
            if ((left == '0' && right == '0') ||
                (left == '1' && right == '1') ||
                (left == '8' && right == '8') ||
                (left == '6' && right == '9') ||
                (left == '9' && right == '6')) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
