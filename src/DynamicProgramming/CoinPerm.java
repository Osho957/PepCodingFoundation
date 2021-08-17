package DynamicProgramming;

import java.util.Scanner;

public class CoinPerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = sc.nextInt();
	    }
	    int amount = sc.nextInt();
	    // int ans = coinRec(a,amount);
	    int ans = coinRecTd(a,amount,new int[amount+1]);
	    // int ans = coinPerm(a, amount);
	    System.out.println(ans);
	}
	
	//Bottom up approach
	  public static int coinPerm(int arr[], int amount) {
		    int dp[] = new int [amount + 1];
		    dp[0] = 1;
		    for (int i = 1; i < dp.length; i++) {
		      for (int j = 0; j < arr.length; j++) {
		        if (i - arr[j] >= 0) {
		          dp[i] += dp[i - arr[j]];
		        }
		      }
		    }
		    return dp[amount];
		  }
	  // Recursive Approach
	  public static int coinRec(int arr[], int amount ) {
		    if (amount == 0)
		    {
		      return 1;
		    }
		    if (amount < 0)
		    {
		      return 0;
		    }
		    int ans = 0;
		    for (int i = 0; i < arr.length; i++)
		    {
		      ans += coinRec(arr, amount - arr[i]);
		    }
		    return ans;
		  }

	  //topDown Approach
		  public static int coinRecTd(int arr[], int amount, int dp[]) {
		    if (amount == 0) {
		      return 1;
		    }

		    if (amount < 0) {
		      return 0;
		    }
		    if (dp[amount] != 0) {
		      return dp[amount];
		    }

		    int ans = 0;
		  
		    for (int i = 0; i < arr.length; i++) {
		      ans += coinRecTd(arr, amount - arr[i], dp);

		    }
		        dp[amount] = ans;
		    return ans;
		  }

}
