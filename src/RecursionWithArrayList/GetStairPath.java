package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
}

public static ArrayList<String> getStairPaths(int n) {
    
      if(n<=0){
        ArrayList<String> bres = new ArrayList<>();
        if(n==0){
        bres.add("");
        }
        return bres;
    }
    ArrayList<String> rres = getStairPaths(n-1);
    ArrayList<String> rres2 = getStairPaths(n-2);
    ArrayList<String> rres3 = getStairPaths(n-3);
    ArrayList<String> myres = new ArrayList<>();
    
    for(String rstr:rres){
        myres.add(1+rstr);
    }
      for(String rstr:rres2){
        myres.add(2+rstr);
    }
      for(String rstr:rres3){
          myres.add(3+rstr);
    }
    
    
    return myres;
}

}
