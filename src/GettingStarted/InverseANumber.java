package GettingStarted;

import java.util.Scanner;

public class InverseANumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	  int n = sc.nextInt();
	  int x =0;
	  int m =1;
	  while(n>0){
	      int temp = n%10;
	      int d=m;
	      int p=temp;
	      
	      x=x+d*(int)Math.pow(10,p-1);
	      n=n/10;
	      m++;
	      
	  }
	  System.out.println(x);
}
}
