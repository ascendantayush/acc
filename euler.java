import java.util.*;

public class EulerPhiSimple {
    static int phi(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (gcd(i, n) == 1) { // coprime check
                count++;
            }
        }
        return count;
    }

    // function to find gcd
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("phi(" + n + ") = " + phi(n));
        sc.close();
    }
}
