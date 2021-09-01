package StackAndQueue;

import java.util.*;

public class PreFixEvaluationAndConversion {

	
	 public static void main(String args[]) {
		 
		 Scanner scanner = new Scanner(System.in);
		   String string = scanner.nextLine();
		   Stack<Integer> vs = new Stack<>();
	       Stack<String> is = new Stack<>();
	       Stack<String> ps = new Stack<>();
	        
	        for(int i=string.length()-1;i>=0;i--){
	            char ch = string.charAt(i);
	            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
	             int v1=vs.pop();
	             int v2=vs.pop();
	             int val = operation(v1,v2,ch);
	             vs.push(val);
	             
	             String iv1 = is.pop();
	             String iv2 = is.pop();
	             String ival = "("+iv1+ch+iv2+")";
	             is.push(ival);
	             
	             String pv1 = ps.pop();
	             String pv2 = ps.pop();
	             String pval = pv1+pv2+ch;
	             ps.push(pval);
	             
	            }else{
	                vs.push(ch-'0');
	                is.push(ch+"");
	                ps.push(ch+"");
	            }
	            	            
	        }
	        System.out.println(vs.pop());
	        System.out.println(is.pop());
	        System.out.println(ps.pop());
		 
	 }
	 
	  public static int operation(int v1,int v2,char ch){
	        
	        if(ch=='+'){
	            return v1+v2;
	        }else if(ch=='-'){
	            return v1-v2;
	        }else if(ch=='*'){
	            return v1*v2;
	        }else {
	            return v1/v2;
	        }
	        
	    
	 }
}
