package FunctionAndArray;

import java.util.Scanner;

public class Subset {
	
	
	static int decimaltobinary(int n) {
		int ans =0;
		int power =1;
		while(n!=0) {
			int rem = n%2;
			n=n/2;
			ans+= rem*power;
			power*=10;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 int  n = sc.nextInt();
 int a[] = new int[n];
 for (int i = 0; i < args.length; i++) {
	a[i] = sc.nextInt();
}
 
 int length =(int) Math.pow(2, n);
 for (int i = 0; i < length; i++) {
	int b = decimaltobinary(i);
	int div = (int)Math.pow(10,n-1);
	for (int j = 0; j < a.length; j++) {
		int q = b/div;
		int rem = b%div;
		if(q==1) {
			System.out.print(a[j]+"\t");
		}else {
			System.out.print("-\t");
		}
		b=rem;
		div=div/10;
	}
	System.out.println();
}
 
 
	}

}
