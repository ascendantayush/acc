import java.util.*;

public class boot{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        //case no 1 numbers given in string format 
        String number1 = cin.next();
        String number2 = cin.next();

        int num1 = Integer.parseInt(number1,2);
        int num2 = Integer.parseInt(number2,2);

        System.out.println(num1 * num2);

        //case 2 in numbers directly give
         
        // int num1 = cin.nextInt();
        // int num2 = cin.nextInt();

        // System.out.println(num1 * num2);
    }
}
