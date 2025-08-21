import java.util.*;

public class CRT {
    static int crt(int[] div, int[] rem, int n) {
        for (int x = 1;; x++) {
            int j = 0;
            while (j < n && x % div[j] == rem[j]) j++;
            if (j == n) return x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] div = new int[n], rem = new int[n];
        for (int i = 0; i < n; i++) div[i] = sc.nextInt();
        for (int i = 0; i < n; i++) rem[i] = sc.nextInt();
        System.out.println(crt(div, rem, n));
    }
}
