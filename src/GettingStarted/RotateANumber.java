package GettingStarted;

import java.util.Scanner;

public class RotateANumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int k = sc.nextInt();
	int cout =0;
	int n =a;
	while(n>0) {
		n = n/10;
		cout++;
	}
	
	k=k%cout;
	if(k<0) {
		k= k+cout;
	}
	int x =1;
	int y =1;
	for(int i =1;i<=cout;i++) {
		if(i<=k) {
			x=x*10;
		}else {
			y =y*10;
		}
	}
	int c = a/x;
	int d = a%x;
	int res=d*y+c;
	System.out.println(res);
	
}
}
