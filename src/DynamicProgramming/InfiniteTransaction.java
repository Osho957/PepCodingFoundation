package DynamicProgramming;

import java.util.Scanner;

public class InfiniteTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i =0;i<n;i++){
	            a[i]= sc.nextInt();
	        }
	        getAns(a);
	        getAns2(a,n);
	}

	private static void getAns2(int[] a,int n) {
		// TODO Auto-generated method stub

	      int buy[] = new int[n];
	      int sell[] = new int[n];
	      buy[0] = 0-a[0];
	      sell[0] = 0;
	      for(int i=1;i<n;i++){
	          buy[i]= Math.max(buy[i-1],sell[i-1]-a[i]);
	          sell[i]= Math.max(sell[i-1],buy[i-1]+a[i]);
	      }
	      System.out.println(sell[n-1]);
	}

	private static void getAns(int[] a) {
		// TODO Auto-generated method stub
		 int sum =0;
	        
	        for(int i=0;i<a.length-1;i++){
	            if(a[i+1]>a[i]){
	                sum=sum+(a[i+1]-a[i]);
	            }
	        }
	        System.out.println(sum);
	}

}
