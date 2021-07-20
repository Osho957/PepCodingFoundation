package Recursion;

import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
     }

     public static void printDecreasing(int n){
         if(n==0){
             return;
         }
         System.out.println(n);
         printDecreasing(n-1);
     }
}
