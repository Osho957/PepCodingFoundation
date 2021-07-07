package FunctionAndArray;

import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a[] = new int[n];
     for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
     int total = (int)Math.pow(2, n);
     for (int i = 0; i < total; i++) {
    	 String set ="";
		int temp =i;
		for (int j = a.length-1; j >= 0; j--) {
			
			int rem = temp%2;
			temp = temp/2;
			if(rem==0) {
				set="- 	 "+set;
			}else {
				set = a[j]+"	"+set;
			}
			
		}
		System.out.println(set);
	}
     
	}

}
