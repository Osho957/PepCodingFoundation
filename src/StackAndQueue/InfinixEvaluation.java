package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class InfinixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
       Stack<Integer> num = new Stack<>();
       Stack<Character> op = new Stack<>();
       for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
	      if(ch=='(') {
		    op.push(ch);
	     }else if (Character.isDigit(ch)) {
	    	 int val = ch-'0';
	    	num.push(val); 
	     }
	     else if( ch=='-'||ch=='+'||ch=='/'||ch=='*') {
	    	 while(op.size()>0&&op.peek()!='('&&precedence(op.peek())>=precedence(ch)) {
	    		 int num2 = num.pop();
	    		 int num1 = num.pop();
	    		 char x = op.pop();
	    		 int val = solve(num1,num2,x);
	    		 num.push(val);
	    	 }
	    	 op.push(ch);
	     }
	     else if(ch==')') {
	    	 while(op.peek()!='(') {
	    		 int num2 = num.pop();
	    		 int num1 = num.pop();
	    		 char x = op.pop();
	    		 int val = solve(num1,num2,x);
	    		 num.push(val);
	    	 }
	    	 op.pop();
	     }
	}
       while(op.size()>0) {
    	 int num2 = num.pop();
  		 int num1 = num.pop();
  		 char x = op.pop();
  		 int val = solve(num1,num2,x);
  		 num.push(val);
       }
       System.out.println(num.peek());
	}
	
	private static int precedence(char ch) {
		if(ch=='+') {
			return 1;
		}else if(ch=='-') {
			return 1;
		}else if(ch=='*') {
			return 2;
		}else {
			return 2;
		}
	}

	private static int solve(int num1, int num2, char x) {
		// TODO Auto-generated method stub
		if(x=='+') {
			return num1+num2;
		}else if(x=='-') {
			return num1-num2;
		}else if(x=='*') {
			return num1*num2;
		}else  {
			return num1/num2;
		}

	}

}
