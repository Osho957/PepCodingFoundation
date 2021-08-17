package DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    long n = sc.nextLong();
	    int b =1;
	    int s =1;
	    
	    for(int i=2;i<=n;i++){
	        int nb=s;
	        int ns=b+s;
	        
	        s=ns;
	        b=nb;
	    }
	    long x = b+s;
	    long ans =x*x ;
	    System.out.println(ans);
	}

}
