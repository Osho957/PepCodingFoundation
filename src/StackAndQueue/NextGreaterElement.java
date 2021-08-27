package StackAndQueue;

import java.util.*;
import java.io.*;

public class NextGreaterElement {

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
		 // next greater from right
		 public static int[] solve(int[] arr){
		  int ans[] = new int [arr.length];
		  int n= arr.length;
		  ans[n-1]=-1;
		  Stack<Integer>ss = new Stack<>();
		  ss.push(arr[n-1]);
		  for(int i=n-2;i>=0;i--){
		      while(!ss.isEmpty()&&ss.peek()<arr[i]){
		          ss.pop();
		      }
		      if(ss.isEmpty()){
		          ans[i]=-1;
		      }else{
		          ans[i]=ss.peek();
		      }
		      ss.push(arr[i]);
		  }
		  return ans;
		 }
		 
		 // next greater from left
		 public static int[] solve2(int[] arr){
			  int ans[] = new int [arr.length];
			  int n= arr.length;
			  ans[0]=-1;
			  Stack<Integer>ss = new Stack<>();
			  ss.push(arr[0]);
			  for(int i=1;i<n;i++){
			      while(!ss.isEmpty()&&ss.peek()<arr[i]){
			          ss.pop();
			      }
			      if(ss.isEmpty()){
			          ans[i]=-1;
			      }else{
			          ans[i]=ss.peek();
			      }
			      ss.push(arr[i]);
			  }
			  return ans;
			 }
}
