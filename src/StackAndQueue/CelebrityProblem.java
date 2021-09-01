package StackAndQueue;
import java.io.*;
import java.util.*;

public class CelebrityProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[][] arr = new int[n][n];

	        for (int j = 0; j < n; j++) {
	            String line = br.readLine();
	            for (int k = 0; k < n; k++) {
	                arr[j][k] = line.charAt(k) - '0';
	            }
	        }

	        findCelebrity(arr);

	}

	private static void findCelebrity(int[][] arr) {
		// TODO Auto-generated method stub
     	Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		
		while(st.size()>=2) {
			int i = st.pop();
			int j = st.pop();
			if(arr[i][j]==1) {
				// i know j hence i is not celeb
				st.push(j);
			}else {
				//i dont know j hence j is not celeb
				st.push(i);
			}
		}
		int pot = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if(i!=pot) {
				if(arr[i][pot]==0||arr[pot][i]==1) {
					System.out.println("none");
					return;
				}
			}
		}
		System.out.println(pot);
	}

}
