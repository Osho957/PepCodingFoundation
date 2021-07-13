package twoDArray;

import java.util.Scanner;

public class MatrixMultiPlication {

	static void multiplyMatrix( 
	        int row1, int col1, int A[][], 
	        int row2, int col2, int B[][]) 
	    { 
	        int i, j, k; 
	        
	        if (row2 != col1) { 
	            System.out.println("Invalid input"); 
	            return;
	        } 
	  
	        int C[][] = new int[row1][col2]; 
	 
	        for (i = 0; i < row1; i++) { 
	            for (j = 0; j < col2; j++) { 
	                for (k = 0; k < col1; k++) 
	                    C[i][j] += A[i][k] * B[k][j]; 
	            } 
	        } 
	  
	        printMatrix(C, row1, col2); 
	    } 
	    
	     static void printMatrix(int M[][], 
	                            int rowSize, 
	                            int colSize) 
	    { 
	        for (int i = 0; i < rowSize; i++) { 
	            for (int j = 0; j < colSize; j++) 
	                System.out.print(M[i][j] + " "); 
	  
	            System.out.println(); 
	        } 
	    }
	  
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int n1=sc.nextInt();
	    int m1=sc.nextInt();
	    int a[][]= new int[n1][m1];
	    for(int i=0;i<n1;i++){
	        for(int j=0;j<m1;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    int n2 = sc.nextInt();
	    int m2 = sc.nextInt();
	    int b[][]=new int[n2][m2];
	     for(int i=0;i<n2;i++){
	        for(int j=0;j<m2;j++){
	           b[i][j]=sc.nextInt(); 
	        }
	    }
	   
	      multiplyMatrix(n1,m1,a,n2,m2,b);

	 }

}
