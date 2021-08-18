package DynamicProgramming;

import java.util.Scanner;

public class MaxSumNonAdjElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   int a[] = new int[n];
   for (int i = 0; i < a.length; i++) {
	a[i]= scanner.nextInt();
}
   int inc[] = new int[n];
   int exc[] = new int[n];
	  inc[0]=a[0];
	  exc[0]=0;
   for (int i = 1; i < exc.length; i++) {
	 exc[i]=Math.max(inc[i-1],exc[i-1]);
	 inc[i]= exc[i-1]+a[i];
}
   System.out.println(Math.max(inc[n-1], exc[n-1]));
	}

}
