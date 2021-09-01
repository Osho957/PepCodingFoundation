package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class SmallestNumberFollowingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner =  new Scanner(System.in);
        String string = scanner.next();
        
        Stack<Integer> ss = new Stack<>();
        int num =1;
        String ans ="";
        ss.push(num);
        for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)=='d') {
				num++;
				ss.push(num);
				
			}else {
				while(ss.size()>0) {
					ans+=ss.pop();
				}
				num++;
			    ss.push(num);
			}
		}
        while(ss.size()>0) {
        	ans+=ss.pop();
        }
        System.out.println(ans);
        
	}

}
