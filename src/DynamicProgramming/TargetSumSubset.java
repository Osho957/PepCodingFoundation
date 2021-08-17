package DynamicProgramming;

import java.util.Scanner;

public class TargetSumSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int a[] = new int[n];
	       for(int i=0;i<n;i++){
	           a[i]= sc.nextInt();
	       }
	       int tar = sc.nextInt();
	       Boolean dp[][]  = new Boolean[n][tar+1];
	       System.out.println(tssBu(a, 0, tar, dp));
	       

	}
	
	public static boolean tss(int arr[],int idx,int tar) {
		if(tar==0) {
			return true;
		}
		
		if(idx>=arr.length||tar<0) {
			return false;
		}
		
		boolean f1 = tss(arr, idx+1, tar);
		boolean f2 = tss(arr, idx+1, tar-arr[idx]);
		
		return f1||f2;
		
	}
	
	public static boolean tssBu(int arr[],int idx,int tar,Boolean dp[][]) {
		if(tar==0) {
			return true;
		}
		
		if(idx>=arr.length||tar<0) {
			return false;
		}
		
		if(dp[idx][tar]!=null) {
			return dp[idx][tar] ;
		}
		boolean f1 = tssBu(arr, idx+1, tar,dp);
		boolean f2 = tssBu(arr, idx+1, tar-arr[idx],dp);
		
		dp[idx][tar] =f1||f2;
		return f1||f2;
		
	}
	
	public static void tssdp(int a[],int tar) {
	       boolean dp[][] = new boolean [a.length+1][tar+1];
		      
	       for(int i=0;i<dp.length;i++){
	           for(int j=0;j<dp[0].length;j++){
	               if(i==0&&j==0){
	                   dp[i][j]=true;
	               }else if(i==0){
	                   dp[i][j]=false;
	               }
	               else if(j==0){
	                   dp[i][j]=true;
	               }else{
	                   if(dp[i-1][j]==true){
	                       dp[i][j]=true;
	                   }
	                   else{
	                       int val = a[i-1];
	                       if(val<=j){
	                           if(dp[i-1][j-val]==true){
	                               dp[i][j]= true;
	                           }
	                       }
	                   }
	               }
	           }
	       }
	       System.out.println(dp[a.length][tar]);
	}

}
