package DynamicProgramming;

import java.util.Scanner;

public class PaintHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[][] = new long[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextLong();
            }
        }
        
        long dp[][] = new long[n][3];
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        
        for(int i=1;i<arr.length;i++){
            dp[i][0]=arr[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=arr[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=arr[i][2]+Math.min(dp[i-1][1],dp[i-1][0]);
        }
        long ans = Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
        System.out.println(ans);
	}

}
