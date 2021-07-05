package FunctionAndArray;

import java.util.Scanner;

public class AnyBaseSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getDifference(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static int getDifference(int b, int n1, int n2){
	       // write your code here
	       
	       int borrow= 0;
	       int ONum = 0;
	       int i=0;
	       while(n2>0){
	           int d1 = n1%10;
	           int d2 = n2%10;
	           
	           int d = 0;
	           d2= d2+borrow;
	           if(d2>=d1){
	               borrow =0;
	               d=d2-d1;
	           }else{
	               borrow=-1;
	               d=d2+b-d1;
	           }
	           ONum+=d*Math.pow(10,i);
	           i++;
	           n1=n1/10;
	           n2=n2/10;
	       }
	     return ONum;
	   }
	}


