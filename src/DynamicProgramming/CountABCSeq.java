package DynamicProgramming;

import java.util.Scanner;

public class CountABCSeq {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a =0;
        int ab =0;
        int abc =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                a=2*a+1;
            }else if(ch=='b'){
                ab=2*ab+a;
            }else{
                abc = 2*abc+ab;
            }
        }
        System.out.println(abc);
    }
}
