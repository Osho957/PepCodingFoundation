package DynamicProgramming;

import java.util.Scanner;

public class BuyAndSellTransactionFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i =0;i<n;i++){
          a[i]= sc.nextInt();
      }
      
   int tf = sc.nextInt();
    int buy[] = new int[n];
    int sell[] = new int[n];
    buy[0] = 0-a[0];
    sell[0] = 0;
    for(int i=1;i<n;i++){
        buy[i]= Math.max(buy[i-1],sell[i-1]-a[i]);
        sell[i]= Math.max(sell[i-1],buy[i-1]+a[i]-tf);
    }
    System.out.println(sell[n-1]);
	}

}
