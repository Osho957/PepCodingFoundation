package DynamicProgramming;

import java.util.Scanner;

public class PaintFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc= new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int a = k*1;
	        int b =k*(k-1);
	        
	        if(n==1){
	            System.out.println(k);
	        }else{
	        
	        for(int i=3;i<=n;i++){
	            int na = b;
	            int nb = (a+b)*(k-1);
	            
	            a=na;
	            b=nb;
	        }
	        System.out.println(a+b);
	        }

	}

}
