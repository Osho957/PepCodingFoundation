package twoDArray;

import java.util.Scanner;

public class SearchIn2dArray {
	
	 private static void search(int[][] mat,  int n, int x)
{

    // set indexes for top right
            int i = 0, j = n - 1;
     // element

            while (i < n && j >= 0)
         {
             if (mat[i][j] == x)
           {
                System.out.println(i);
                System.out.println(j);
                return;
            }
          if (mat[i][j] > x)
                   j--;
          else // if mat[i][j] < x
                   i++;
}

System.out.print("Not Found");
return; // if ( i==n || j== -1 )
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int a[][]= new int[n][n];
	       for(int i=0;i<n;i++){
	           for(int j=0;j<n;j++){
	           a[i][j]=sc.nextInt();
	     }  }
	     int x= sc.nextInt();
       search(a, n, x);
		
	}

}
