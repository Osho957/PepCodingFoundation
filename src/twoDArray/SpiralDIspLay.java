package twoDArray;

import java.util.Scanner;

public class SpiralDIspLay {

	
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a[][]= new int [n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              a[i][j]= sc.nextInt();
          }
      }
       int minr =0;
       int minc =0;
       int maxr =n-1;
       int maxc =m-1;
       int total =n*m;
       int cout =0;
       while(cout<total){
           for(int i=minr,j=minc ;i<=maxr&&cout<total;i++){
               
               System.out.println(a[i][j]);
               cout++;
           }
           minc++;
          for(int i=maxr,j=minc ;j<=maxc&&cout<total;j++){
               
               System.out.println(a[i][j]);
                cout++;
           }
           maxr--;
             for(int i=maxr,j=maxc ;i>=minr&&cout<total;i--){
               
               System.out.println(a[i][j]);
                cout++;
           }
           maxc--;
             for(int i=minr,j=maxc ;j>=minc&&cout<total;j--){
               
               System.out.println(a[i][j]);
                cout++;
           }
           minr++;
       }
   

}
}
