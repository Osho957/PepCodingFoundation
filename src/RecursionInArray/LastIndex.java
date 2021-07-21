package RecursionInArray;

import java.util.Scanner;

public class LastIndex {

	

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int a[]= new int[n];
         for(int i=0;i<n;i++){
             a[i]= sc.nextInt();
         }
         int x = sc.nextInt();
         System.out.println(lastIndex(a,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        
          
        if(idx==arr.length){
            return -1;
        }
        
        
       int ans = lastIndex(arr,idx+1,x);
       if(ans!=-1){
           return ans;
       }
        else if(arr[idx]==x){
            return idx;
        }else{
            return -1;
        }
        
      
    }

}
