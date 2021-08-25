package StackAndQueue;
import java.util.*;

public class DuplicateBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String s = sc.nextLine();
		    Stack<Character>st = new Stack<>();
		    for (int i = 0; i < s.length(); i++) {
		      char ch = s.charAt(i);
		      if (ch == ')') {
		        if (st.peek() == '(') {
		          System.out.println(true);
		          return;
		        }
		        else {
		          while (st.peek() != '(') {
		            st.pop();
		          }

		          st.pop();
		        }
		      } else {
		        st.push(ch);
		      }
		    }
		    System.out.println(false);
	}

}
