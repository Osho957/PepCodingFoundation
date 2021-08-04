package TimeAndSpaceComplexity;

import java.util.Scanner;

public class RadixSort {
	public static void radixSort(int[] arr) {
	    // write code here  
	    int max = Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++){
	    max= Math.max(arr[i],max);
	}

	int place =1;
	while(place<=max){
	    countSort(arr,place);
	    place*=10;
	}
	    
	  }

	  public static void countSort(int[] arr, int exp) {
	    // write code here
	     int freq[] = new int[10];
	   for(int i=0;i<arr.length;i++){
	       freq[(arr[i]/exp) %10]++;
	   }
	       
	       for(int i=1;i<freq.length;i++){
	           freq[i]=freq[i]+freq[i-1];
	       }
	       int ans[] = new int[arr.length];
	       for(int i=arr.length-1;i>=0;i--){
	        int idx =  freq[(arr[i]/exp) %10];
	        ans[idx-1]=arr[i];
	         freq[(arr[i]/exp) %10]--;
	       }
	    for(int i=0;i<ans.length;i++){
	        arr[i]=ans[i];
	    }
	    
	    System.out.print("After sorting on " + exp + " place -> ");
	    print(arr);
	  }

	  public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }

	  public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    radixSort(arr);
	    print(arr);
	  }

}
