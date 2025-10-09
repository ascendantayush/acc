import java.util.*;

public class flipped {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int maxLen = 0;


        int a = cin.nextInt();
        String num = Integer.toBinaryString(a);


        for(int i = 0 ; i < num.length() ; i++){
            if(num.charAt(i) == '0'){
                String flipper = num.substring(0,i) + '1' + num.substring(i+1);

                String[] split = flipper.split("0");
                for(int j = 0 ; j < split.length ; j++){
                    maxLen = Math.max(maxLen,split[j].length());
                }
            }
        }

        if(!num.contains("0")){
            maxLen = num.length();
        }

        System.out.println(maxLen);
    }
}
