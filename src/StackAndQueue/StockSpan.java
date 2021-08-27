package StackAndQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {

	 public static void display(int[] a){
		    StringBuilder sb = new StringBuilder();

		    for(int val: a){
		      sb.append(val + "\n");
		    }
		    System.out.println(sb);
		  }

		public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    int n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    for(int i = 0; i < n; i++){
		       a[i] = Integer.parseInt(br.readLine());
		    }

		    int[] nge = solve(a);
		    display(nge);
		 }

		private static int[] solve(int[] a) {
			int ans[]=  new int[a.length];
			int n = ans.length;
			ans[0]=1;
			Stack<Integer>ss = new Stack<>();
			ss.push(0);
			for(int i=1;i<n;i++) {
				while(!ss.isEmpty()&&a[ss.peek()]<a[i]) {
					ss.pop();
				}
				if(ss.isEmpty()) {
					ans[i]=i+1;
				}else {
					ans[i]=i-ss.peek();
				}
				ss.push(i);
			}
			return ans;
		
		}

}
