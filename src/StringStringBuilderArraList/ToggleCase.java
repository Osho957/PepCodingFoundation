package StringStringBuilderArraList;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     String s = sc.next();
	     String x="";
	     for(int i=0;i<s.length();i++) {
	    	 if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
	    		 x=x+s.toUpperCase().charAt(i);
	    	 }else {
	    		 x=x+s.toLowerCase().charAt(i);
	    	 }
	     }
	     System.out.println(x);
	}

}
