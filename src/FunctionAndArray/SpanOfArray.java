package FunctionAndArray;
import java.util.Scanner;
public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int max = Integer.MIN_VALUE;
		   int min = Integer.MAX_VALUE;
		   int a[] = new int[n];
		   for(int i=0;i<n;i++){
		       a[i]= sc.nextInt();
		       if(max<a[i]){
		           max=a[i];
		       }
		       if(min>a[i]){
		           min=a[i];
		       }
		   }
		   System.out.println(max-min);
	}

}
