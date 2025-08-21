// import java.util.*;
// public class alice{
//     public static void main(String[] args){
//         Scanner cin = new Scanner(System.in);

        
//     }
// }


import java.util.*;
public class alice{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        
        int apple = cin.nextInt();
        int count = 0 ;
        int layer = 0 ;

        while(count < apple){
            layer++;
            count = count + 12 * layer * layer;
        }

        System.out.println(8 * layer);
        

    }
}   