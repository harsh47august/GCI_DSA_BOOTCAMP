import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    // we are going to jump  from next greater to next greater till it is 
    // in a window if its outiside window then  just last next greater element is 
    // max of that window
    int [] ngr = new int[a.length];
    ngr[a.length - 1]  = -1;
    Stack<Integer> st = new Stack<>();
    st.push(a.length - 1);
    for(int i = a.length - 2 ; i >= 0; i--){
       while(st.size() > 0 && a[i] >= a[st.peek()]){
          st.pop();
       }
       if( st.size() == 0){
          ngr[i] = a.length;
       } else{
          ngr[i] = st.peek();
       }
       st.push(i);
    }
    int j = 0;
    for( int i =0 ; i <= a.length - k ; i++){
       if( j < i){
          j = i;
       }
       while(ngr[j] < i + k){
          j = ngr[j];
       }
       System.out.println(a[j]);
    }

}
}