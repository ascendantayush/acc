import java.util.*;

public class swap {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        // String sb = cin.next();
        // StringBuilder s = new StringBuilder(sb);

        // int l = 0;
        // int r = ( s.length() / 2 );

        // while(r!=s.length()){
        //     char temp = s.charAt(l);
        //     s.setCharAt(l, s.charAt(r));
        //     s.setCharAt(r,temp);

        //     l++;
        //     r++;
        // }   

        // System.out.println(sb);
        // System.out.println(s);

        String binary = cin.next();
        String first_nibble = binary.substring(0,4);
        String second_nibble = binary.substring(4);

        System.out.println(second_nibble + first_nibble);

    }
}
