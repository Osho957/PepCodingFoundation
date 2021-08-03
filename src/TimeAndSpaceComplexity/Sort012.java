package TimeAndSpaceComplexity;

import java.util.Scanner;

public class Sort012 {
	
	public static void sort012(int[] arr){
	    //write your code here
	    int i=0;
	    int j=arr.length-1;
	    int mid =0;
	    while(mid<=j){
	        if(arr[mid]==0){
	            swap(arr,mid,i);
	            mid++;
	            i++;
	        }else if(arr[mid]==1){
	            mid++;
	        }else{
	            swap(arr,mid,j);
	            j--;
	        }
	    }
	  }

	  // used for swapping ith and jth elements of array
	  public static void swap(int[] arr, int i, int j) {
	    System.out.println("Swapping index " + i + " and index " + j);
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }

	  public static void print(int[] arr){
	    for(int i = 0 ; i < arr.length; i++){
	      System.out.println(arr[i]);
	    }
	  }
	  public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n; i++){
	      arr[i] = scn.nextInt();
	    }
	    sort012(arr);
	    print(arr);
	  }

}
