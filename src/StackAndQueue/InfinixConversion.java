package StackAndQueue;

import java.util.*;

public class InfinixConversion {
//a*(b-c+d)/e
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);
	       String s = scanner.nextLine();

	       Stack<Character>opr = new Stack<>();
	       Stack<String> postfix = new Stack<>();
	       Stack<String> prefix = new Stack<>();
	       
	       for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='(') {
				opr.push(ch);
			}else if(ch==')') {
				while(opr.peek()!='(') {
					String val1 = postfix.pop();
					String val2 = postfix.pop();
					char c = opr.pop();
					String post = val2+val1+c;
					postfix.push(post);
					
					val1 =prefix.pop();
				    val2 =prefix.pop();			
					String pre =c+val2+val1;
					prefix.push(pre);
				}
				opr.pop();
				
			}else if(ch=='+'||ch=='-'||ch=='/'||ch=='*') {
				while(opr.size()>0&&opr.peek()!='('&&precedence(opr.peek())>=precedence(ch)) {
					
					String val1 = postfix.pop();
					String val2 = postfix.pop();
					char c = opr.pop();
					String post = val2+val1+c;
					postfix.push(post);
					
					val1 =prefix.pop();
				    val2 =prefix.pop();			
					String pre =c+val2+val1;
					prefix.push(pre);
				}
				opr.push(ch);
			}else if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				postfix.push(ch+"");
				prefix.push(ch+"");
			}
			
		}
	       while(opr.size()>0) {
	    		String val1 = postfix.pop();
				String val2 = postfix.pop();
				char c = opr.pop();
				String post = val2+val1+c;
				postfix.push(post);
				
				val1 =prefix.pop();
			    val2 =prefix.pop();			
				String pre =c+val2+val1;
				prefix.push(pre);
	       }
	     
	       System.out.println(postfix.peek());
	       System.out.println(prefix.peek());
	
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


}
