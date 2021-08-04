package TimeAndSpaceComplexity;

import java.util.Scanner;

public class SortDates {

	 public static void sortDates(String[] arr) {
		    // write your code here
		      countSort(arr,1000000,100,32);
		      countSort(arr,10000,100,13);
		      countSort(arr,1,10000,2501);
		  }

		  public static void countSort(String[] arr,int div, int mod, int range) {
		    // write your code here
		     int freq[] = new int[range];
		   for(int i=0;i<arr.length;i++){
		       freq[Integer.parseInt(arr[i],10)/div %mod]++;
		   }
		       
		       for(int i=1;i<freq.length;i++){
		           freq[i]=freq[i]+freq[i-1];
		       }
		      String ans[] = new String[arr.length];
		       for(int i=arr.length-1;i>=0;i--){
		        int idx =  freq[Integer.parseInt(arr[i],10)/div %mod];
		        ans[idx-1]=arr[i];
		         freq[Integer.parseInt(arr[i],10)/div %mod]--;
		       }
		    for(int i=0;i<ans.length;i++){
		        arr[i]=ans[i];
		    }
		  }

		  public static void print(String[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.println(arr[i]);
		    }
		  }

		  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    String[] arr = new String[n];
		    for (int i = 0; i < n; i++) {
		      String str = scn.next();
		      arr[i] = str;
		    }
		    sortDates(arr);
		    print(arr);
		  }

}
