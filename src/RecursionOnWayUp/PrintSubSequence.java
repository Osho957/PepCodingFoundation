package RecursionOnWayUp;

import java.util.Scanner;

public class PrintSubSequence {

	

    public static void main(String[] args) throws Exception {
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           printSS(s , "");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros,ans+ch);
        printSS(ros,ans+"");
    }

}
