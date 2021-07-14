package StringStringBuilderArraList;

import java.util.Scanner;

public class PrintPermutation {

	public static void solution(String str){
		// write your code here
		int len = factorial(str.length());
		for(int i=0;i<len;i++){
		    StringBuilder sb=  new StringBuilder(str);
		    int temp = i;
		    for(int j=str.length();j>=1;j--){
		        int quo = temp/j;
		        int rem = temp%j;
		        
		        System.out.print(sb.charAt(rem));
		        sb.deleteCharAt(rem);
		        
		        temp = quo;
		    }
		    System.out.println();
		}
	
		
	}
	
	public static int factorial(int n ){
	   int fact =1;
	   for(int i=1;i<=n;i++){
	       fact=fact*i;
	   }
	   return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
