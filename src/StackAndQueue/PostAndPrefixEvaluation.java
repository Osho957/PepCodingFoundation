package StackAndQueue;

import java.util.*;

public class PostAndPrefixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);
	       String s = scanner.nextLine();
	       Stack<Integer> val = new Stack<>();
	       Stack<String> post = new Stack<>();
	       Stack<String>pre = new Stack<>();
	       
	       for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='+'||ch=='-'||ch=='/'||ch=='*') {
				int v1 = val.pop();
				int v2 = val.pop();
				int value = operation(v1,v2,ch);
				val.push(value);
				
				String s1 =post.pop();
				String s2 =post.pop();
				String ans = "("+s2+ch+s1+")";
				post.push(ans);
				
				s1 =pre.pop();
			    s2 =pre.pop();
			    ans = ch+s2+s1;
			    pre.push(ans);
				
				
			}else {
				val.push(ch-'0');
				post.push(ch+"");
				pre.push(ch+"");
			}
		}
	       System.out.println(val.peek());
	       System.out.println(post.peek());
	       System.out.println(pre.peek());

	}
	 
	 public static int operation(int v1,int v2,char ch){
	     if(ch=='+'){
	         return v2+v1;
	     }else if(ch=='-'){
	         return v2-v1;
	     }else if(ch=='*'){
	         return v1*v2;
	     }else{
	         return v2/v1;
	     }
	 }
}
