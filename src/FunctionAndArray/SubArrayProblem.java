package FunctionAndArray;

import java.util.Scanner;

public class SubArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int a[] = new int[n];
		   for(int i=0;i<n;i++){
		       a[i]= sc.nextInt();
		   }
		   for(int i=0;i<n;i++){
		       for(int j=i;j<n;j++){
		           for(int k=i;k<=j;k++){
		           System.out.print(a[k]+"	");
		           }System.out.println();
		       }
		   }
	}

}
