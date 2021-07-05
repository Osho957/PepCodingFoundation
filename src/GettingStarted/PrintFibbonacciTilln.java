package GettingStarted;

import java.util.Scanner;

public class PrintFibbonacciTilln {

	 static void fibonacci(int n) {
			int a =0;
			int b =1;
			System.out.println(a);
			System.out.println(b);
			int c =0;
			for(int i=1;i<=n-2;i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
		}
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    fibonacci(x);
	   }
}
