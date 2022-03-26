import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePaths(1,1,n,m);
        System.out.println(ans);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if( sr > dr || sc > dc){
            ArrayList<String> br = new ArrayList<String>();
            return br;

        } else if( sr == dr && sc == dc){
            ArrayList<String> br = new ArrayList<String>();
            br.add("");
            return br;
       }

        ArrayList<String> hpaths = getMazePaths( sr,  sc + 1 ,  dr,  dc);
        ArrayList<String> vpaths = getMazePaths( sr + 1 ,  sc  ,  dr,  dc); 
        ArrayList<String> mres = new ArrayList<String>();
        for(String hpath : hpaths){
            mres.add( "h" + hpath);
        }
        for(String vpath : vpaths){
            mres.add( "v" + vpath);
        }
        return mres;



    }
}

