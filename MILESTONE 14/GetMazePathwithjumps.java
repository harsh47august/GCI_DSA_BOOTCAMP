import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePaths(1, 1, n ,m );
        System.out.println(ans);
        

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if( sr == dr && sc == dc){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        ArrayList<String> mres = new ArrayList<String>();

        for( int ms = 1 ; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = getMazePaths( sr,  sc + ms,  dr,  dc);
            for(String hpath : hpaths){
                mres.add( "h" + ms + hpath);
            }

        }
        for( int ms = 1 ; ms <= dr - sr; ms++){
            ArrayList<String> vpaths = getMazePaths( sr + ms,  sc,  dr,  dc);
            for(String vpath : vpaths){
                mres.add( "v" + ms + vpath);
            }
            

        }
        for( int ms = 1 ; ms <= dc - sc && ms <= dr - sr; ms++){
            ArrayList<String> dpaths = getMazePaths( sr + ms,  sc + ms,  dr,  dc);
            for(String dpath : dpaths){
                mres.add( "d" + ms + dpath);
            }

        }
        return mres;
        
    }

}