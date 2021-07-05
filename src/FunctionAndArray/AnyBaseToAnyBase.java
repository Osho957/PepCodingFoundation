package FunctionAndArray;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     int d = getValue(n,sourceBase,destBase);
	     System.out.println(d);
	   }   
	   
	   public static int getValue(int n, int b1, int b2){
	       int x =getValueIndecimal(n, b1);
	       int y =getValueInBase(x, b2);
	       return y;
	   }
	   
	    public static int getValueIndecimal(int n, int b){
	      int x =0;
	      int p=1;
	      while(n>0){
	          int temp = n%10;
	          n=n/10;
	          
	          x =x+temp*p;
	          p = p*b;
	          
	      }
	      return x;
	   }
	    public static int getValueInBase(int n, int b){
	      int ans =0;
	      int x =1;
	      while(n>0){
	          int rem = n%b;
	          ans = ans+(rem*x);
	          x=x*10;
	          n=n/b;
	      }
	      return ans;
	   } 

}
