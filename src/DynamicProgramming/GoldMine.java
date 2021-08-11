package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class GoldMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int arr[][] = new int[n][m];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < m; j++) {
	        arr[i][j] = sc.nextInt();
	      }
	    }
	    int dp[][]=new int[n][m];
	    for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
		}
	    int max =Integer.MIN_VALUE;
	    for (int i = 0; i < arr.length; i++) {
		     max = Math.max(max, goldmineTd(arr,i,0,dp));
		}

	   // int max = goldMine(arr);
	    System.out.println(max);
	  }

	  public static int goldMine(int arr[][]) {
	    int dp[][] = new int[arr.length][arr[0].length];

	    for (int j = arr[0].length - 1; j >= 0; j--) {
	      for (int i = 0; i < arr.length; i++) {
	        if (j == arr[0].length - 1) {
	          dp[i][j] = arr[i][j];
	        } else if (i == 0) {
	          dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
	        }
	        else if (i == arr.length - 1) {
	          dp[i][j] = arr[i][j] +  Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
	        } else {
	          dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
	        }
	      }
	    }
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < arr.length; i++) {
	      if (max < dp[i][0]) {
	        max = dp[i][0];
	      }
	    }
	    return max;
	  }
	  
	  
	  public static int goldmineRec (int arr[][],int sr , int sc) {
		  
		  if(sr<0||sr>=arr.length) {
			  return Integer.MIN_VALUE;
		  }
		  
		  if(sc==arr[0].length-1) {
			  return arr[sr][sc];
		  }
		  
		  
		  int way1 = goldmineRec(arr, sr-1, sc+1);
		  int way2 = goldmineRec(arr, sr, sc+1);
		  int way3 = goldmineRec(arr, sr+1, sc+1);
		  
		  int ans = arr[sr][sc] + Math.max(way1, Math.max(way2, way3));
		  return ans;
	
	  }
	  
      public static int goldmineTd (int arr[][],int sr , int sc,int dp[][]) {
		  
		  if(sr<0||sr>=arr.length) {
			  return Integer.MIN_VALUE;
		  }
		  
		  if(sc==arr[0].length-1) {
			  return arr[sr][sc];
		  }
		  if(dp[sr][sc]!=-1) {
			  return dp[sr][sc];
		  }
		  
		  int way1 = goldmineRec(arr, sr-1, sc+1);
		  int way2 = goldmineRec(arr, sr, sc+1);
		  int way3 = goldmineRec(arr, sr+1, sc+1);
		  
		  int ans = arr[sr][sc] + Math.max(way1, Math.max(way2, way3));
		  dp[sr][sc]= ans;
		  return ans;
	  }


}
