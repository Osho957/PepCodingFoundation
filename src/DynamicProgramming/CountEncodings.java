package DynamicProgramming;

import java.util.Scanner;

public class CountEncodings {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
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

}
