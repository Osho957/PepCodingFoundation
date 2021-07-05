package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int x = n/2;
	        int y = 1;
	        int num=1;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=x;j++){
	                System.out.print("	");
	            }
	            int val =num;
	            for(int j=1;j<=y;j++){
	                System.out.print(val+"	");
	                if(j<=y/2){
	                    val++;
	                }else{
	                    val--;
	                }
	            }
	            if(i<=n/2){
	                x--;
	                y=y+2;
	                num++;
	            }else{
	                x++;
	                y=y-2;
	                num--;
	            }
	            System.out.println();
	        }
	}

}
