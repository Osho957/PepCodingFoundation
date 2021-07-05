package GettingStarted;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    while(n>0){
		        int temp = n%10;
		        System.out.println(temp);
		        n=n/10;
		    }
	}

}
