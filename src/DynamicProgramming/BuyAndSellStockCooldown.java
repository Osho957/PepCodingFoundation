package DynamicProgramming;

import java.util.Scanner;

public class BuyAndSellStockCooldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int a[] = new int[n];
	      for(int i =0;i<n;i++){
	          a[i]= sc.nextInt();
	      }
	      
	 
	    int buy[] = new int[n];
	    int sell[] = new int[n];
	    buy[0] = 0-a[0];
	    sell[0] = 0;
	    for(int i=1;i<n;i++){
	        if(i==1){
	            buy[i]= Math.max(-a[i],buy[i-1]);
	        }else{
	        buy[i]= Math.max(buy[i-1],sell[i-2]-a[i]);
	        }
	        sell[i]= Math.max(sell[i-1],buy[i-1]+a[i]);
	    }
	    System.out.println(sell[n-1]);
	}

}
