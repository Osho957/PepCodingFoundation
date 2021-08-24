package DynamicProgramming;

import java.util.Scanner;

public class BuyAndSellStocks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int a[] = new int[n];
       for (int i = 0; i < a.length; i++) {
		a[i]= scanner.nextInt();
	}
       int maxP = Integer.MIN_VALUE;
       int minB = Integer.MAX_VALUE;
       for (int i = 0; i < a.length; i++) {
    	   minB=Math.min(minB, a[i]);
		maxP= Math.max(maxP, a[i]-minB);
	}
       System.out.println(maxP);
	}

}
