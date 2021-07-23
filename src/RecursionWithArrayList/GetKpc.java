package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
    static String codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            String  s= sc.next();
            ArrayList<String> ans = getKPC(s);
            System.out.println(ans);
            
    }

    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
          
          char ch = str.charAt(0);
           ArrayList<String> rres = getKPC(str.substring(1));
            ArrayList<String> myres = new ArrayList<>();
            String codeForch = codes[ch-'0']; 
            for(int i=0;i<codeForch.length();i++){
              char chCode =  codeForch.charAt(i);
              for(String rstr:rres){
                  myres.add(chCode+rstr);
              }
              
            }
        
            
            return myres;
    }
}
