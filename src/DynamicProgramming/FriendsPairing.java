package DynamicProgramming;

import java.util.Scanner;

public class FriendsPairing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int ans = dpcount(n);
       System.out.println(ans);
	}

	private static int countWays(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
	   int ans =0;
	  int ans1=countWays(n-1);
	   int ans2=(n-1)*countWays(n-2);
	  // int ans2=countWays(n-2);
		//ans = ans1;
	   ans=ans1+ans2;
		return ans;
		
	}
	
	public static int dpcount(int n) {
		int dp[]= new int [n+1];
		dp[0]=1;
		dp[1]=1;
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+(i-1)*dp[i-2];
		}
		return dp[n];
	}

}
