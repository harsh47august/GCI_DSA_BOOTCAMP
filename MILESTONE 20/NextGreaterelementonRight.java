public static int[] solve(int[] arr){
    int [] nge = new int[arr.length];
    nge[arr.length - 1] = -1;
     Stack<Integer> st = new Stack<>();
     st.push(arr.length - 1);
     for(int i = arr.length - 2 ; i >= 0 ; i--){
       while(st.size()>0 && arr[i] >= arr[st.peek()]){
         st.pop();
       }
       if( st.size() == 0){
         nge[i] = -1;
       } else {
         nge[i] = arr[st.peek()];
       }
       st.push(i);
 
     }
     return nge;
 
 
  }    
