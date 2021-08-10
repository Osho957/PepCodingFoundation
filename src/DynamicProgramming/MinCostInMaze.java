package DynamicProgramming;

import java.util.Scanner;

public class MinCostInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a[][] = new int [n][m];
      for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			a[i][j]= sc.nextInt();
		}
	}
     // int ans =findCost(a);
      int ans = minCostTD(a, 0, 0,new int [n][m]);
      System.out.println(ans);
	}
	
	private static int minCost(int[][] a,int r,int c) {
		if(r==a.length-1&&c==a[0].length-1) {
			return a[r][c];
		}
		if(r>=a.length||c>=a[0].length) {
			return Integer.MAX_VALUE;
		}
		int ans;
		ans = Math.min(minCost(a, r+1, c),minCost(a,r,c+1))+a[r][c];
		return ans;
	}
	
	private static int minCostTD(int[][] a,int r,int c,int dp[][]) {
		if(r==a.length-1&&c==a[0].length-1) {
			return a[r][c];
		}
		if(r>=a.length||c>=a[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[r][c]!=0) {
			return dp[r][c];
		}
		int ans;
		ans = Math.min(minCostTD(a, r+1, c,dp),minCostTD(a,r,c+1,dp))+a[r][c];
		dp[r][c]=ans;
		return ans;
	}



	private static int findCost(int[][] a) {
		// TODO Auto-generated method stub
		int dp[][] = new int[a.length][a[0].length];
		for (int i =dp.length-1; i >= 0; i--) {
			for (int j = dp[0].length-1; j >= 0; j--) {
				if(i==dp.length-1&&j==dp[0].length-1) {
					dp[i][j]=a[i][j];
				}else if(i==dp.length-1) {
					dp[i][j]=a[i][j]+dp[i][j+1];
				}else if(j==dp[0].length-1) {
					dp[i][j]=a[i][j]+dp[i+1][j];
				}else {
					dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+a[i][j];
				}
			}
		}
	
		return dp[0][0];
	}

}
