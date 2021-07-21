package RecursionInArray;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
       System.out.println(maxOfArray(a,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx==arr.length-1){
            return arr[idx];
        }
        
        int max =   maxOfArray(arr,idx+1);
        
       if(max>arr[idx]){
           return max;
       }else{
           return arr[idx];
       }
        
      
        
    }

}
