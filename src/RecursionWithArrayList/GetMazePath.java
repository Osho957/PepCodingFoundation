package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
	 public static void main(String[] args) throws Exception {
         Scanner sc=  new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         ArrayList<String>ans = getMazePaths(0,0,n,m);
         System.out.println(ans);
         
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
     
        if(sr>=dr||sc>=dc){
            return new ArrayList<>();
        }
           
           if(sr==dr-1 && sc == dc-1){
               ArrayList<String> bres = new ArrayList<>();
               bres.add("");
               return bres;
           }
        ArrayList<String> rres1 = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> rres2 = getMazePaths(sr+1,sc,dr,dc);
      
        ArrayList<String> myres = new ArrayList<>();
        for(String rstr:rres1){
            myres.add("h"+rstr);
        }
        
        for(String rstr:rres2){
            myres.add("v"+rstr);
        }
     return myres;
     
    }
}
