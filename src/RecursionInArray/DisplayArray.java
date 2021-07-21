package RecursionInArray;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<a.length;i++){
	            a[i]= sc.nextInt();
	        }
	        displayArr(a,0);
	    }

	    public static void displayArr(int[] arr, int idx){
	        if(idx==arr.length){
	            return;
	        }
	        
	        System.out.println(arr[idx]);
	        
	        displayArr(arr,idx+1);
	    }

}
