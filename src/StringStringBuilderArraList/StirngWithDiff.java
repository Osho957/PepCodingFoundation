package StringStringBuilderArraList;

import java.util.Scanner;

public class StirngWithDiff {


	public static String solution(String str){
		 String ans ="";
	   int diff =0;
	   for(int i=0;i<str.length()-1;i++){
	       char ch1 = str.charAt(i+1);
	       char ch2 = str.charAt(i);
	       diff = ch1-ch2;
	       ans+=ch2;
	       ans+=diff;
	   }
	   
	   ans+=str.charAt(str.length()-1);

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}


}
