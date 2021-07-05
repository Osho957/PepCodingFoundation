package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1 ;i<=n ; i++) {
			for(int j =1; j<= n-i ; j++) {
				System.out.print("	");
			}for(int j=1; j<=i; j++) {
				System.out.print("*	");
			}System.out.println();
		}
	}

}
