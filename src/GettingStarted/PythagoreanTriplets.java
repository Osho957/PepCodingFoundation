package GettingStarted;

import java.util.Scanner;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();

		    int max = a;
		    if (b >= max)
		      max = b;

		    if (c >= max)
		      max = c;

		    if (max == a) {
		      System.out.println((b * b + c * c) == (a * a));
		    } else if (max == b) {
		      System.out.println((a * a + c * c) == (b * b));
		    } else {
		      System.out.println((a * a + b * b) == (c * c));
		    }
	}

}
