package Patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    for (int i = 1 ; i <= n; i++)
	    {
	      for (int j = 1 ; j <= n; j++)
	      {
	        if ( i == 1) 
	        {
	          if ( j == n || j <= n / 2 + 1)
	          {
	            System.out.print("*	");
	          }
	          else
	          {
	            System.out.print("	");
	          }
	        }
	        else if (i <= n / 2)
	        {
	          if ( j == n || j == n / 2 + 1)
	          {
	            System.out.print("*	");
	          }
	          else
	          {
	            System.out.print("	");
	          }
	        }
	        else if ( i == n / 2 + 1) 
	        {
	          System.out.print("*	");
	        }
	        else if (i < n)
	        {
	          if (j == 1 || j == n / 2 + 1)
	          {
	            System.out.print("*	");
	          }
	          else
	          {
	            System.out.print("	");
	          }
	        }
	        else 
	        {
	          if (j == 1 || j >= n / 2 + 1)
	          {
	            System.out.print("*	");
	          }
	          else
	          {
	            System.out.print("	");
	          }
	        }
	      }
	      System.out.println();
	    }
	}

}
