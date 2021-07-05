package FunctionAndArray;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int d = scn.nextInt();
	        int f = getDigitFrequency(n, d);
	        System.out.println(f);
	    }

	    public static int getDigitFrequency(int n, int d) {
	        // write code here
	          int res =0;
	        while(n>0){
	            int temp = n%10;
	            if(temp==d){
	                res++;
	            }
	            n=n/10;
	        }
	        return res;
	    }
	}


