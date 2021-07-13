package twoDArray;

import java.util.Scanner;

public class RingRotate {
	
	
	public static  void rotateShell(int a[][],int s,int r) {
		int oned[] = fillOnedFromShell(a,s);
		rotate(oned,r);
		fillShellFromOned(a,s,oned);
	}
	
	private static void fillShellFromOned(int[][] a, int s, int[] oned) {
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
    
    int idx =0;
    
    for (int i = minr,j=minc; i <=maxr; i++) {
		 a[i][j]=oned[idx];
		idx++;
	}
    for (int i = maxr,j=minc+1; j <=maxc; j++) {
			 a[i][j]=oned[idx];
			idx++;
		}
    for (int i = maxr-1,j=maxc; i >=minr; i--) {
	     a[i][j]=oned[idx];
			idx++;
		}
    for (int i = minr,j=maxc-1; j >=minc+1; j--) {
			 a[i][j]=oned[idx];
			idx++;
		}
    
   
		
		
	}

	private static int[] fillOnedFromShell(int[][] a, int s) {
            int minr = s-1;
            int minc = s-1;
            int maxr = a.length-s;
            int maxc = a[0].length-s;
        
            int total = 2*(maxr-minr+maxc-minc);
            int oned[] = new int[total];
        int idx =0;
        
        for (int i = minr,j=minc; i <=maxr; i++) {
			oned[idx]= a[i][j];
			idx++;
		}
        for (int i = maxr,j=minc+1; j <=maxc; j++) {
   			oned[idx]= a[i][j];
   			idx++;
   		}
        for (int i = maxr-1,j=maxc; i >=minr; i--) {
   			oned[idx]= a[i][j];
   			idx++;
   		}
        for (int i = minr,j=maxc-1; j >=minc+1; j--) {
   			oned[idx]= a[i][j];
   			idx++;
   		}
        
        return oned;
	}

	public static void rotate(int oned[], int r) {
		r= r%oned.length;
		if(r<0) {
			r=r+oned.length;
		}
		
		reverse(oned,0,  oned.length-r-1);
		reverse(oned,oned.length-r,oned.length-1);
		reverse(oned,0,oned.length-1);
		
	}

	private static void reverse(int[] a, int i, int j) {
		
		
		while(i<j) {
			int temp = a[i];
			a[i]=a[j];
			a[j]= temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int m  = sc.nextInt();
	       int a[][] = new int[n][m];
	       
	        for(int i=0;i<a.length;i++){
	            for(int j=0;j<a[0].length;j++){
	                a[i][j]= sc.nextInt();
	            }
	        }
	        int s = sc.nextInt();
	        int r = sc.nextInt();
	        rotateShell(a,s,r);
	        display(a);
	        		
	}
	
	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	

}
