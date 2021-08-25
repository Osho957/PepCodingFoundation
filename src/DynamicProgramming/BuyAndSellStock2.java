package DynamicProgramming;

import java.util.Scanner;

public class BuyAndSellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for (int i = 0; i < n; i++) {
		      a[i] = sc.nextInt();
		    }

		    int maxT = 0;
		    int minB = a[0];
		    int dp[] = new int[n];
		    for (int i = 1; i < n; i++) {
		      minB = Math.min(minB, a[i]);
		      maxT = a[i] - minB;
		      if (maxT > dp[i - 1]) {
		        dp[i] = maxT;
		      } else {
		        dp[i] = dp[i - 1];
		      }
		    }

		    int maxC = 0;
		    int minC = a[n - 1];
		    int dp1[] = new int[n];
		    for (int i = n - 2; i >= 0; i--) {
		      minC = Math.max(minC, a[i]);
		      maxC = minC - a[i];
		      if (maxC > dp1[i + 1]) {
		        dp1[i] = maxC;
		      } else {
		        dp1[i] = dp1[i + 1];
		      }
		    }
		    int ans = Integer.MIN_VALUE;
		    for (int i = 0; i < dp.length; i++) {
		      ans = Math.max(ans, dp[i] + dp1[i]);
		    }
		    System.out.println(ans);
		  

	}

}
