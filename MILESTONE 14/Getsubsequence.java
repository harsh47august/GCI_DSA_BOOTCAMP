import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(gss( str) );
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> br = new ArrayList<String>();
            br.add("");
            return br ;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);
        ArrayList<String> rres = gss(rem);
        ArrayList<String> mres = new ArrayList<>();
        for( String sub : rres){
            mres.add("" +sub);

        }
        for( String sub : rres){
            mres.add( ch + sub);

        }
        return mres ;
        
        


    }


}