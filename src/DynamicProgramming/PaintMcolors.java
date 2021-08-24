package DynamicProgramming;

import java.util.Scanner;

public class PaintMcolors {

	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int k  = sc.nextInt();
	      int a[][]= new int[n][k];
	      for(int i=0;i<n;i++){
	          for(int j=0;j<k;j++){
	              a[i][j]= sc.nextInt();
	          }
	      }
	      int dp[][] = new int[n][k];
	      for(int i=0;i<n;i++){
	          for(int j=0;j<k;j++){
	              if(i==0){
	                  dp[i][j]=a[i][j];
	              }else{
	                  int min = Integer.MAX_VALUE;
	                  for(int m=0;m<k;m++){
	                      if(m!=j){
	                          if(dp[i-1][m]<min){
	                              min=dp[i-1][m];
	                          }
	                      }
	                  }
	                  dp[i][j]=a[i][j]+min;
	              }
	          }
	      }
	      int ans = Integer.MAX_VALUE;
	      for(int i=0;i<k;i++){
	          if(dp[n-1][i]<ans){
	              ans=dp[n-1][i];
	          }
	      }
	      System.out.println(ans);
	      
	}
	
	public static int approach2(int a[][],int n,int k) {
		int dp[][] = new int[n][k];
	    int least = Integer.MAX_VALUE;
	    int sLeast = Integer.MAX_VALUE;

	    for (int i = 0; i < k; i++) {
	      dp[0][i] = a[0][i];
	      if (dp[0][i] <least) {
	        sLeast = least;
	        least = dp[0][i];
	      } else if (dp[0][i] <sLeast) {
	        sLeast = dp[0][i];
	      }
	    }

	    for (int i = 1; i < n; i++) {
	      int nleast = Integer.MAX_VALUE;
	      int nsLeast = Integer.MAX_VALUE;
	      for (int j = 0; j < k; j++) {
	        if (dp[i - 1][j] == least) {
	          dp[i][j] = a[i][j] + sLeast;
	        } else {
	          dp[i][j] = a[i][j] + least;
	        }

	        if (dp[i][j] <nleast) {
	          nsLeast = nleast;
	          nleast = dp[i][j];
	        } else if (dp[i][j] < nsLeast) {
	          nsLeast = dp[i][j];
	        }
	      }
	      least = nleast;
	      sLeast = nsLeast;
	    }
	 return least;
	}
}
