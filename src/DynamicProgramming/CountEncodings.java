package DynamicProgramming;

import java.util.Scanner;

public class CountEncodings {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		solve(s);
		int dp[] = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		for (int i = 2; i < dp.length; i++) {
			int oned = Integer.valueOf(s.substring(i - 1, i));
			int twod = Integer.valueOf(s.substring(i - 2, i));

			if (oned >= 1) {
				dp[i] += dp[i - 1];
			}

			if (twod >= 10 && twod <= 26) {
				dp[i] += dp[i - 2];
			}

		}

		System.out.println(dp[s.length()]);

	}

	private static void solve(String s) {
		
		int dp[] = new int[s.length()];
		dp[0] = 1;
		for (int i = 1; i < dp.length; i++) {
			if(s.charAt(i-1)=='0'&&s.charAt(i)=='0') {
				dp[i]=0;
			}else if(s.charAt(i-1)=='0'&&s.charAt(i)!='0') {
				dp[i]=dp[i-1];
			}else if(s.charAt(i-1)!='0'&&s.charAt(i)=='0') {
				if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2') {
					dp[i]=( i>=2?dp[i-2]:1);
				}else {
					dp[i]=0;
				}
			}else {		
				if(Integer.parseInt(s.substring(i-1,i+1))<=26) {
					
					dp[i]=(i>=2?dp[i-2]:1)+dp[i-1];
					
				}else {
					dp[i]=dp[i-1];
				}
			}
			
		}
		System.out.println(dp[s.length()-1]);
	}

}
