package twoDArray;

import java.util.Scanner;

public class StateOfWakanda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[][] = new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                a[i][j]= sc.nextInt();
	            }
	        }
	        for(int dia=0;dia<n;dia++){
	           int i=0;int j = dia;
	           while(j<n){
	               System.out.println(a[i][j]);
	               i++;
	               j++;
	           }
	        }
	}

}
