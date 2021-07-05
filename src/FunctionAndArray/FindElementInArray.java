package FunctionAndArray;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int a[] = new int [n];
		   for(int i=0;i<n;i++){
		       a[i]= sc.nextInt();
		   }
		   int d = sc.nextInt();
		   boolean x= false;
		   for(int i=0;i<n;i++){
		       if(d==a[i]){
		        System.out.println(i);
		        x = true;
		       }
		   }
		   if(!x){
		       System.out.println(-1);
		   }
	}

}
