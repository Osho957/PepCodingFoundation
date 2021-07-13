package twoDArray;

import java.util.Scanner;

public class SaddlePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int n  = sc.nextInt();
	        int a[][]= new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                a[i][j]= sc.nextInt();
	            }
	        }
	        
	        for(int i=0;i<n;i++){
	            int sj =0;
	            for(int j=0;j<n;j++){
	                if(a[i][j]<a[i][sj]){
	                    sj=j;
	                }
	            }
	            boolean exist = true;
	            for(int j=0;j<n;j++){
	                if(a[j][sj]>a[i][sj]){
	                    exist=false;
	                }
	            }
	            if(exist){
	                System.out.println(a[i][sj]);
	                return;
	            }
	        }
	           System.out.println("Invalid input");
	}

}
