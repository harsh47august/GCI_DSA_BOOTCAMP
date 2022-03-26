import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);


    }

    public static ArrayList<String> getStairPaths(int n) {
        if( n == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        } else if(n<0){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
            
        }


        ArrayList<String> path1 =  getStairPaths( n - 1);
        ArrayList<String> path2 =  getStairPaths( n - 2);
        ArrayList<String> path3 =  getStairPaths( n - 3);
        ArrayList<String> mres = new ArrayList<String>();
        for(  String path : path1){
            mres.add("1" + path);

        }
        for( String path : path2){
            mres.add("2" + path);
            
        }
        for( String path : path3){
            mres.add("3" + path);
            
        }
        return mres;

    }

}
