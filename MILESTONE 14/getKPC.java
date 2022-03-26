import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getKPC( str));



    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }


        char ch = str.charAt(0);
        String rstr = str.substring(1);
        ArrayList<String> rres =  getKPC( rstr);
        ArrayList<String> mres = new ArrayList<>();
        String codeforch = codes[ch - '0'];
        for( int i =0 ; i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String r : rres){
                mres.add(chcode + r);
            }

        }
        return mres;
        



        


    }

}