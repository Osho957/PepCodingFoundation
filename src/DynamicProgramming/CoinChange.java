package DynamicProgramming;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++){
	            a[i]= sc.nextInt();
	        }
	        int amount = sc.nextInt();
	       // int ans = coinRec(a,amount,0);
	        //int ans = cointRecTd(a,amount,0,new int [amount+1]);
	        int ans = coinComb(a,amount);
	        System.out.println(ans);
	    }
	    
	    public static int coinComb(int arr[],int amount){
	        int dp[] = new int [amount+1];
	        dp[0]=1;
	        for(int i=0;i<arr.length;i++){
	            for(int j=arr[i];j<=amount;j++){
	                dp[j]+=dp[j-arr[i]];
	            }
	        }
	        return dp[amount];
	    }
	    
	    public static int coinRec(int arr[],int amount,int idx ){
	        if(amount==0)
	        {
	            return 1;
	        }
	        if(amount<0)
	        {
	            return 0;
	        }
	        int ans =0;
	        for(int i=idx;i<arr.length;i++)
	        {
	          ans+=coinRec(arr,amount-arr[i],i);  
	        }
	        return ans;
	    }
	    
	    public static int coinRecTd(int arr[],int amount,int idx,int dp[] ){
	        if(amount==0){
	            return 1;
	        }
	        
	        if(amount<0){
	            return 0;
	        }
	        if(dp[amount]!=0){
	            return dp[amount];
	        }
	        
	        int ans =0;
	        dp[amount]=ans;
	        for(int i=idx;i<arr.length;i++){
	          ans+=coinRecTd(arr,amount-arr[i],i,dp);  
	     
	        }
	        return ans;
	    }

}
