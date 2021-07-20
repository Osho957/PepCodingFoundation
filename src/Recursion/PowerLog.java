package Recursion;

import java.util.Scanner;

public class PowerLog {

    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(x,n));
        
    }

    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        
       int xpn =pow(x,n/2);
       int xp = xpn*xpn;
       
       if(n%2==1){
           xp=xp*x;
       }
       
       return xp;
    }
}
