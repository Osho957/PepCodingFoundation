package GettingStarted;

import java.util.Scanner;

public class IsNumberPrime {

	
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(isPrime(x)){
                System.out.println("prime");
            }else{
                 System.out.println("not prime");
            }
        }
  }   
  
}
