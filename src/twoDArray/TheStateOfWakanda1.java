package twoDArray;

import java.util.Scanner;

public class TheStateOfWakanda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int a[][] = new int [n][m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            a[i][j]= sc.nextInt();
	        }
	    }
	    for(int i=0;i<m;i++){
	         if(i%2==0){
	        for(int j=0;j<n;j++){
	           
	            System.out.println(a[j][i]);
	        }
	        }else{
	            for(int j=n-1;j>=0;j--){
	                System.out.println(a[j][i]);
	            }
	        }
	    }
	}

}
