package StringStringBuilderArraList;

import java.util.Scanner;

public class PrintAllPalindromicString {

	
	public static void solution(String str){
		
	for(int i=0;i<str.length();i++){
	    for(int j =i+1;j<=str.length();j++){
	        if(isPalindrome(str.substring(i,j))){
	            System.out.println(str.substring(i,j));
	        }
	    }
	}
		
	}
	
	public static boolean isPalindrome(String s){
	    int i=0;
	    int j = s.length()-1;
	    while(i<j){
	        if(s.charAt(i)!=s.charAt(j)){
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
