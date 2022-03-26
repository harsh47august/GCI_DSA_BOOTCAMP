import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncresing( n);

    }

    public static void printIncresing(int n){
        if( n==0) return ;
        printIncresing( n -1);
        System.out.println(n);

        
    }
}