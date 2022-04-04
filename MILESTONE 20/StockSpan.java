public static int[] solve(int[] arr){
    int [] sp = new int[arr.length];
    sp[0] = 1;
    Stack<Integer> st = new Stack<>();
    st.push(0);
    for(int i = 1 ; i < arr.length ; i++){
      while(st.size() > 0 && arr[i] >= arr[st.peek()]){
        st.pop();
      }
      if(st.size() == 0){
        sp[i] = i + 1;
      } else{
        sp[i] = i - st.peek();
      }
      st.push(i);
    }
    return sp;
 
  }