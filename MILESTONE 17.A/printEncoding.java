import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String  str = scn.nextLine();
        printEncodings(str , "");

    }

    public static void printEncodings(String str , String asf) {


        if( str.length() == 0){
            System.out.println(asf);
            return ;

        } else if( str.length() == 1){
            char ch = str.charAt(0);
            if( ch == 0){
                return;
            }else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                asf+=code;
                System.out.println(asf);


            }
        }else{
            char ch = str.charAt(0);
            String rstr = str.substring(1);
            if( ch == '0'){
                return;
            }else{
                int chv = ch - '0';
                char code = (char)( 'a' + chv - 1);
                printEncodings( rstr ,  asf + code);

            }
            String ch12 = str.substring(0 , 2);
            String rstr12 = str.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char)( 'a' + ch12v - 1);
                printEncodings( rstr12 ,  asf + code);
            }


        }
        
    }

}