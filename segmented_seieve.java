import java.util.*;

public class seieve{
    
    static void seive(int n ,int l ,int h){
        int[] prime = new int[n+1];

        // 0 = not prime and 1 = prime
        
        prime[0] = 0;
        prime[1] = 0;

        for(int i = 2; i < prime.length ; i++){
            prime[i] = 1;
        }

        for(int p = 2 ; p * p < prime.length ; p++){
            if(prime[p] == 1){
                for(int i = p * p ; i <= n ; i =i + p){
                    prime[i]=0;
                }
            }
        }

        int count = 0;
        for(int i= l; i <= h; i++){
            if(prime[i] == 1){
                count++;
                System.out.printf("%d ",i);
            }

        }


        System.out.println();


        System.out.println(count);

        

    }


    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int l = cin.nextInt();
        int h = cin.nextInt();

        seive(h,l,h);

    }
}
