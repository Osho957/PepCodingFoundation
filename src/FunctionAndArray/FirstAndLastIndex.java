package FunctionAndArray;

import java.util.Scanner;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int a[] = new int [n];
		   for(int i=0;i<n;i++){
		       a[i]= sc.nextInt();
		   }
		   int x = sc.nextInt();
		   int low= 0;
		   int high =n-1;
		   int fi = -1;
		   while(low<=high){
		       int mid = (low+high)/2;
		       if(x>a[mid]){
		       low = mid+1;
		   }else if(x<a[mid]){
		       high = mid-1;
		   }else{
		       fi = mid;
		       high = mid-1;
		   }
		 }
		System.out.println(fi);
		    low= 0;
		    high =n-1;
		    int li = -1;
		   while(low<=high){
		       int mid = (low+high)/2;
		       if(x>a[mid]){
		       low = mid+1;
		   }else if(x<a[mid]){
		       high = mid-1;
		   }else{
		       li = mid;
		       low = mid+1;
		   }
		   }
		   System.out.println(li);
		 
	}

}
