package DynamicProgramming;

import java.util.Scanner;

public class CountStairs {

	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int ans=  countDp(n);
	        System.out.println(ans);
	        
	    }
	    
	    //memoisation
	    public static int countStair(int n,int a[]){
	        if(n==0){
	            return 1;
	        }
	        if(n<0){
	            return 0;
	        }
	        if(a[n]!=0){
	            return a[n];
	        }
	        int one = countStair(n-1,a);
	        int two = countStair(n-2,a);
	        int three = countStair(n-3,a);
	        int ans=one+two+three;
	        a[n]=ans;
	        return ans;
	    }
	    //tabulation
	    public static int countDp(int n){
	        int dp[] = new int[n+1];
	        dp[0]=1;
	        dp[1]=1;
	        dp[2]=2;
	        for(int i=3;i<dp.length;i++){
	            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
	        }
	        return dp[n];
	    }
}
