package DynamicProgramming;

import java.util.Scanner;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
       int b[] = new int[n];
       for (int i = 0; i < b.length; i++) {
		b[i]= sc.nextInt();
	}
<<<<<<< HEAD
       int capacity = sc.nextInt();
       int dp[][] = new int[n+1][capacity+1];
=======
       int cap = sc.nextInt();
       int dp[][] = new int[n+1][cap+1];
>>>>>>> 89e70c13e2ba400c28269dbbf61d64b157a4b42f
       for (int i = 1; i < dp.length; i++) {
		for (int j = 1; j < dp[0].length; j++) {
			if(j-b[i-1]>=0) {
				dp[i][j]=Math.max(dp[i-1][j-b[i-1]]+a[i-1],dp[i-1][j]);
			}else {
				dp[i][j]=dp[i-1][j];
			}
		}
	}
<<<<<<< HEAD
       System.out.println(dp[n][capacity]);
=======
       System.out.println(dp[n][cap]);
>>>>>>> 89e70c13e2ba400c28269dbbf61d64b157a4b42f
	}

}
