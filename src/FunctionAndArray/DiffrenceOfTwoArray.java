package FunctionAndArray;

import java.util.Scanner;

public class DiffrenceOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scn = new Scanner (System.in);
	     int n1 = scn.nextInt ();
	     int[] a1 = new int[n1];
	     for (int i = 0; i < a1.length; i++)
	     {
	       a1[i] = scn.nextInt ();
	     }
	     int n2 = scn.nextInt ();
	     int[] a2 = new int[n2];
	     for (int i = 0; i < a2.length; i++)
	     {
	       a2[i] = scn.nextInt ();
	     }
	     int[] diff = new int[n2];
	     int i = a1.length - 1;
	     int j = a2.length - 1;
	     int carry = 0;
	     while (j >= 0)
	     {
	       int digit = 0;
	       int a1v = i >= 0 ? a1[i] : 0;
	       if (a2[j] + carry >= a1v)
	       {
	         digit = a2[j] + carry - a1v;
	         carry = 0;
	       }
	       else
	       {
	         digit = a2[j] + 10 + carry - a1v;
	         carry = -1;
	       }
	       diff[j] = digit;
	       i--;
	       j--;
	     }
	     int idx = 0;
	  
	     while (diff[idx] == 0)
	     {
	       ++idx;
	     }
	     while (idx < diff.length) 
	     {
	       System.out.println (diff[idx++]);
	     }
	}

}
