class Solution {
    public int largestRectangleArea(int[] heights) {
        int [] nsl = new int[heights.length];
        nsl[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1 ; i < heights.length ; i++){
            while( st.size()>0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nsl[i] = -1;
            }else{
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        
        int [] nsr = new int[heights.length];
        nsr[heights.length - 1] = heights.length;
        Stack<Integer> s = new Stack<>();
        s.push(heights.length - 1);
        for(int i = heights.length - 2 ; i >=0 ; i--){
            while( s.size()>0 && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.size() == 0){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        int maxArea = 0 ;
        for(int i =0 ; i < heights.length ; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i]*width;
            
            if(area>maxArea){
                maxArea = area;
            }
        }
        return maxArea;
        
    }
}
