package StringStringBuilderArraList;

import java.util.Scanner;

public class StringCompression {


	public static String compression1(String str){
	    String ans ="";
	    for(int i=0;i<str.length()-1;i++){
	        char ch = str.charAt(i);
	        char ch1 = str.charAt(i+1);
	        if(ch!=ch1){
	            ans+=ch;
	        }
	    }
	    ans+=str.charAt(str.length()-1);
	    return ans;
	}

	public static String compression2(String str){
	
	int count =1;
	String ans ="";
	for(int i=0;i<str.length()-1;i++){
	    char ch = str.charAt(i);
	    char ch1 = str.charAt(i+1);
	    if(ch==ch1){
	        count++;
	    }else{
	       ans+=ch;
	       if(count!=1){
	           ans+=count;
	       }
	        count=1;
	    }
	}
	
	ans+=str.charAt(str.length()-1);
	if(count!=1){
	    ans+=count;
	}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
