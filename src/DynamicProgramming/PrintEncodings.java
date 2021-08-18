package DynamicProgramming;

import java.util.Scanner;

public class PrintEncodings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int dp[] = new int[s.length()+1];
	    dp[0]=1;
	    dp[1]=s.charAt(0)=='0'?0:1;
	    for(int i=2;i<dp.length;i++){
	        int oned = Integer.valueOf(s.substring(i-1,i));
	         int twod = Integer.valueOf(s.substring(i-2,i));
	         
	         if(oned>=1){
	             dp[i]+=dp[i-1];
	         }
	         
	         if(twod>=10&&twod<=26){
	             dp[i]+=dp[i-2];
	         }
	         
	         
	    }
	    
	    System.out.println(dp[s.length()]);

	}
	
	//recusrsive approach
    public static int solve(String s, int idx){
        
    if(idx == s.length()){
        return 1;
    }
    
    if(idx>s.length()){
        return 0;
    }
    
    if(s.charAt(idx)=='0'){
        return 0;
    }
    
    int c1 =solve(s,idx+1);
    int c2 =0;
    if(s.length()-2>=idx&&Integer.parseInt(s.substring(idx,idx+2))<=26){
        c2 =solve(s,idx+2);
    }
    
    return c1+c2;
}

}
