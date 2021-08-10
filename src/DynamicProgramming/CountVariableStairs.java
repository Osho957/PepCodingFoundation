package DynamicProgramming;

import java.util.Scanner;

public class CountVariableStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int [n];
       for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
//     int ans =  climbstair(a,0);
//     int ans =  climbstairTd(a,0,new int[n+1]);
       int ans = BUpClimb(a);
     System.out.println(ans);
	}

	private static int climbstair(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i==a.length) {
			return 1;
		}
		if(i>a.length) {
			return 0;
		}
		
		int ans=0;
		for (int jump = 1; jump <= a[i]; jump++) {
			ans+=climbstair(a, i+jump);
		}
		
		return ans;
	}
	
	private static int climbstairTd(int[] a, int i,int dp[]) {
		// TODO Auto-generated method stub
		if(i==a.length) {
			return 1;
		}
		if(i>a.length) {
			return 0;
		}
		if(dp[i]!=0){
		    return dp[i];
		}
		
		int ans=0;
		for (int jump = 1; jump <= a[i]; jump++) {
			ans+=climbstairTd(a, i+jump,dp);
		}
		dp[i]=ans;
		return ans;
	}
	
	public static int BUpClimb(int a[]) {
		int n = a.length;
		int dp[] = new int[a.length+1];
		dp[a.length]=1;
		for (int i = n-1; i >= 0; i--) {
			for (int j = 1; j <= a[i]; j++) {	
				if(i+j<dp.length) {
				dp[i]+=dp[i+j];
				}
			}
			
		}
		return dp[0];
	}
	
	

}
