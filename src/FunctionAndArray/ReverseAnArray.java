package FunctionAndArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseAnArray {

	 public static void reverse(int[] a){
	      int n = a.length;
	    for(int i=n-1;i>=0;i--){
	        System.out.print(a[i]+" ");
	    }System.out.println();
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a);
	    
	 }

}
