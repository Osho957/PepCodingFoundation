package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (n/2);
		int y = 1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=x;j++){
		        		System.out.print("	");
		    }
		    for(int j=1;j<=y;j++){
		      	System.out.print("*	");
		    } 
		    
		    if(i<=n/2){
		        x--;
		        y+=2;
		    }else{
		        x++;
		        y-=2;
		    }
		    
		    System.out.println();
		    
		}
	}

}
