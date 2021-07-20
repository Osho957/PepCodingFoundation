package Recursion;

import java.util.Scanner;

public class PowerLinear {

	
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
        
        return x*pow(x,n-1);
    }

}
