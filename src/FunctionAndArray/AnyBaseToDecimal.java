package FunctionAndArray;

import java.util.Scanner;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	   }
	  
	   public static int getValueIndecimal(int n, int b){
	      // write your code here
	      int num =0;
	      int i=0;
	      while(n!=0){
	         int temp = n%10;
	          num+=temp*Math.pow(b,i);
	          i++;
	          n=n/10;
	      }
	      return num;
	   }
}
