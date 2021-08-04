package DynamicProgramming;

import java.util.Scanner;

public class FibbonacciDp {

	public static void main(String[] args) throws Exception {
	    Scanner sc  = new Scanner(System.in);
	    int n = sc.nextInt();
	    int ans = fibbDp(n,new int[n+1]);
	    System.out.println(ans);
	 }
	 
	 public static int fibbrecursive(int n){
	     
	     if(n==0||n==1){
	         return n;
	     }
	     
	     return fibbrecursive(n-1)+fibbrecursive(n-2);
	 }
	 
	 public static int fibbDp(int n,int a[]){
	     
	     if(n==0||n==1){
	         return n;
	     }
	     if(a[n]!=0){
	         return a[n];
	     }
	     
	     int ans = fibbDp(n-1,a)+fibbDp(n-2,a);
	     a[n]=ans;
	     return ans;
	 }
}
