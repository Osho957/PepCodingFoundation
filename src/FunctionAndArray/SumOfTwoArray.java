package FunctionAndArray;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n1 = sc.nextInt();
		    int a[] = new int[n1];
		    for(int i=0;i<n1;i++){
		        a[i]= sc.nextInt();
		      }
		       int n2 = sc.nextInt();
		    int b[] = new int[n2];
		    for(int i=0;i<n2;i++){
		        b[i]= sc.nextInt();
		      }
		      int sum[] = new int[n1>n2?n1:n2];
		      int c= 0;
		      int i =n1-1;
		      int j =n2-1;
		      int k=sum.length-1;
		      while(k>=0){
		          int d= c;
		          if(i>=0){
		              d=d+a[i];
		          }
		          if(j>=0){
		              d=d+b[j];
		          }
		          c=d/10;
		          d=d%10;
		          sum[k]=d;
		          i--;
		          j--;
		          k--;
		      }
		      if(c!=0){
		          System.out.println(c);
		      }
		      for(i=0;i<sum.length;i++){
		          System.out.println(sum[i]);
		      }
		      
	}

}
