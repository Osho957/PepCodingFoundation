package RecursionInArray;

import java.util.Scanner;

public class DisplayArrayInReverse {
	
    public static void main(String[] args) throws Exception {
        // write your code here
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        displayArrReverse(a,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
            if(idx==arr.length){
                return ;
            }
            
            displayArrReverse(arr,idx+1);
            System.out.println(arr[idx]);
            
    }


}
