package GettingStarted;

import java.util.Scanner;

public class GcdAndLcm {

	   static int gcd(int a,int b) {
			if(b==0) {
				return a;
			}
			return gcd(b,a%b);
		}
		
		static int lcm(int a,int b) {
			return (a*b)/gcd(a,b);
		}
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(gcd(n,m));
			System.out.println(lcm(n,m));
	     }

}
