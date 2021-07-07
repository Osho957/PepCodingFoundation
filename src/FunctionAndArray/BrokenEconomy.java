package FunctionAndArray;

import java.util.Scanner;

public class BrokenEconomy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int a[]= new int[n];
	     for(int i=0;i<n;i++){
	         a[i] = sc.nextInt();
	     }
	     int d = sc.nextInt();
	     int lo =0;
	     int hi =n-1;
	    
	    int ceil =0;
	    int high=0;
	     while(lo<=hi){
	        int mid = (lo+hi)/2;
	         if(d>a[mid]){
	             lo=mid+1;
	             ceil=a[mid];
	         }else if(d<a[mid]){
	             hi=mid-1;
	             high=a[mid];
	         }else{
	             ceil= a[mid];
	             high =a[mid];
	             break;
	         }
	         
	     }
	   
	      System.out.println(high);
	       System.out.println(ceil);
	}

}
