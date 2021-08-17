package DynamicProgramming;

import java.util.Scanner;

public class CountBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   
	    int a=1;
	    int b=1;
	    for(int i=2;i<=n;i++){
	       int nb=a+b;
	       int na=b;
	        
	       b=nb;
	       a=na;
	        
	    }
	    
	    System.out.println(a+b);
	    
	}

}
