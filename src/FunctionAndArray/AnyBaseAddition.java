package FunctionAndArray;

import java.util.Scanner;

public class AnyBaseAddition {
	 public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getSum(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static int getSum(int b, int n1, int n2){
	      
	     int carry =0;
	     int N =0;
	     int i=0;
	     while(n1>0||n2>0){
	         int temp1 =n1%10;
	         int temp2 =n2%10;
	         
	         int temp = temp1+temp2;
	         temp+=carry;
	         carry =0;
	         if(temp>=b){
	             carry=temp/b;
	             temp= temp%b;
	         }
	         
	         N+=temp*Math.pow(10,i);
	         i++;
	         n1=n1/10;
	         n2=n2/10;
	     }
	     
	     if(carry>0){
	         
	     } N+=carry*Math.pow(10,i);
	    
	     return N;
	      
	   }
}
