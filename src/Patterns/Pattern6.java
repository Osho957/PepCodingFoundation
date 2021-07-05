package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (n/2)+1;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x-i+1;j++) {
				System.out.print("*	");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("	");
			}
			for(int j=1;j<=x-i+1;j++) {
				System.out.print("*	");
			}
			System.out.println();
		}
		for(int i=1;i<=n-x;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print("*	");
			}
			for(int j=1;j<=2*(x-i)-1;j++) {
				System.out.print("	");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print("*	");
			}
			System.out.println();
		}
	}

}
