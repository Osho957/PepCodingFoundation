package StackAndQueue;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < arr.length; i++) {
		arr[i]= scanner.nextInt();
	}
      int k = scanner.nextInt();
      // doubly queue
      Deque<Integer>dq = new ArrayDeque<>();
      for (int i = 0; i < k; i++) {
		while(dq.size()>0&&arr[dq.getLast()]<arr[i]) {
			dq.removeLast();
		}
		dq.addLast(i);
	}
      System.out.println(arr[dq.peek()]);
      
      for (int i = k; i < arr.length; i++) {
    		while(dq.size()>0&&arr[dq.getLast()]<arr[i]) {
    			dq.removeLast();
    		}
    		dq.addLast(i);
    		if(dq.peek()<=i-k) {
    			dq.removeFirst();
    		}
    		System.out.println(arr[dq.peek()]);
	}
	}

}
