package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
		a[i]= scanner.nextInt();
	}
    int nsr[] = new int[n];
    Stack<Integer> nxtSr = new Stack<>();
    nsr[0]=-1;
    nxtSr.push(0);
    for (int i = 1; i < nsr.length; i++) {
		while(!nxtSr.isEmpty()&&a[nxtSr.peek()]>=a[i]) {
			nxtSr.pop();
		}
		if(nxtSr.isEmpty()) {
			nsr[i]=-1;
		}else {
			nsr[i]=nxtSr.peek();
		}
		nxtSr.push(i);
	}
    int nsl[] = new int[n];
    Stack<Integer> nxtSl = new Stack<>();
    nsl[n-1]=n;
    nxtSl.push(n-1);
    for (int i = n-2; i >=0; i--) {
		while(!nxtSl.isEmpty()&&a[nxtSl.peek()]>=a[i]) {
			nxtSl.pop();
		}
		if(nxtSl.isEmpty()) {
			nsl[i]=n;
		}else {
			nsl[i]=nxtSl.peek();
		}
		nxtSl.push(i);
	}
 
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nsl.length; i++) {
		max= Math.max(max, a[i]*(Math.abs(nsr[i]-nsl[i])-1));
	}
    System.out.println(max);
    
	}

}
