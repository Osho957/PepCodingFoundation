package twoDArray;

import java.util.Scanner;

public class Rotate90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]= sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]= temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int left =0;
            int right =n-1;
            while(left<right){
                int val = a[i][left];
                a[i][left]=a[i][right];
                a[i][right] = val;
                left++;
                right--;
            }
        }
        display(a);

	}
	 public static void display(int[][] arr){
	        for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[0].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
