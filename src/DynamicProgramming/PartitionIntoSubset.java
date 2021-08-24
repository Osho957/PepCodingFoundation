package DynamicProgramming;

import java.util.Scanner;

public class PartitionIntoSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner  scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int k = scanner.nextInt();
   int ans =   countDp(n,k);
   System.out.println(ans);
	}

	private static int count(int n, int k) {
		// TODO Auto-generated method stub
		if(n==k) {
			return 1;
		}
		if(n<0||k<0) {
			return 0;
		}
		int ans  =0;
		int ans1 = count(n-1,k-1);
		int ans2 =count(n-1,k)*k;
		ans=ans1+ans2;
		return ans;
	}
	
	public static int countDp(int n,int k) {
		int dp[][] = new int[n+1][k+1];
		dp[0][0]=1;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j]= dp[i-1][j-1]+dp[i-1][j]*j;
			}
		}
		
		return dp[n][k];
		
 	}

}
