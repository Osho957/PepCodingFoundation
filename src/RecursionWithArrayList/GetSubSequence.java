package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {

	  public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        String s  = sc.next();
	        ArrayList<String> ans = gss(s);
	        System.out.println(ans);
	    }
	     //SubSequence
	    public static ArrayList<String> gss(String str) {
	        if(str.length()==0){
	            ArrayList<String>bres = new ArrayList<>();
	            bres.add("");
	            return bres;
	        }
	       char ch = str.charAt(0);
	       ArrayList<String> rres  = gss(str.substring(1));
	        ArrayList<String>myres = new ArrayList<>();
	        for(String rstr:rres){
	            myres.add(""+rstr);
	       
	        }
	          for(String rstr:rres){
	            myres.add(ch+rstr);
	        }
	        return myres;
	    }
}
