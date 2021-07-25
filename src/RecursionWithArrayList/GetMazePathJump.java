package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathJump {
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
        
      
        if(sr==dr-1&&sc==dc-1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        
        ArrayList<String> myres = new ArrayList<>();
        for(int i=1;i<=dc-sc;i++){
            
            ArrayList<String> rres = getMazePaths(sr,sc+i,dr,dc);
            
            for(String rstr:rres){
                myres.add("h"+i+rstr);
            }
        }
        
         for(int i=1;i<=dr-sr;i++){
            
            ArrayList<String> rres = getMazePaths(sr+i,sc,dr,dc);
            
            for(String rstr:rres){
                myres.add("v"+i+rstr);
            }
        }
              for(int i=1;i<=dr-sr&&i<=dc-sc;i++){
            
            ArrayList<String> rres = getMazePaths(sr+i,sc+i,dr,dc);
            
            for(String rstr:rres){
                myres.add("d"+i+rstr);
            }
        }
        
        return myres;
    }
}
