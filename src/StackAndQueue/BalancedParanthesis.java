package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      Stack<Character> ss = new Stack<>();
      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          if(ch=='{'||ch=='['||ch=='('){
              ss.push(ch);
          }else if(ch=='}'){
            boolean val =isValid(ss,'{');
            if(!val){
                System.out.println("false");
                return;
            }
          }else if(ch==')'){
          boolean val = isValid(ss,'(');
          
            if(!val){
                System.out.println("false");
                return;
            }
          }else if(ch==']'){
         boolean val = isValid(ss,'[');
          
            if(!val){
                System.out.println("false");
                return;
            }
          }
       }
       if(ss.isEmpty()){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
}
    
    
    public static boolean isValid(Stack<Character>ss,char ch){
          if(ss.size()==0){
              
               return false;
           }else if(ss.peek()!=ch){
                
               return false;  
           }else{
               ss.pop();
               return true;
           }
    }
}
