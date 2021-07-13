package twoDArray;

import java.util.Scanner;

public class SpiralDIspLay {

	
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m  = sc.nextInt();
      int a[][] = new int[n][m];
      
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               a[i][j]= sc.nextInt();
           }
       }
       
       int count =0;
       int total = n*m;
       int minr =0;
       int minc =0;
       int maxr =n-1;
       int maxc = m-1;
       
   while(count<total){
       
       
       for(int i=minr;i<=maxr&&count<total;i++){
           System.out.println(a[i][minc]);
           count++;
       }
       minc++;
       
           for(int i=minc;i<=maxc&&count<total;i++){
           System.out.println(a[maxr][i]);
           count++;
       }
       maxr--;
       
       for(int j=maxr;j>=minr&&count<total;j--){
              System.out.println(a[j][maxc]);
              count++;
       }
       
       maxc--;
       
          for(int j=maxc;j>=minc&&count<total;j--){
              System.out.println(a[minr][j]);
              count++;
       }
       minr++;
       
       
   }
   

}
}
