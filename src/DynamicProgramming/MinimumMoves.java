package DynamicProgramming;

import java.util.Scanner;

public class MinimumMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
     int ans =  minimumMoves(a);
     System.out.println(ans);
	}
	
	




	private static int minimumMoves(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		int dp[] = new int[a.length];
		dp[a.length-1]=0;
		for (int i = n-2; i >=0; i--) {
				dp[i]=Integer.MAX_VALUE;
				for (int j = 1; j <=a[i]; j++) {
					if(i+j<dp.length) {
					dp[i]=Math.min(dp[i], dp[i+j]);
				}
				}
				if(dp[i]!=Integer.MAX_VALUE) {
					dp[i]+=1;
			}
		}
		return dp[0];
	}

}
