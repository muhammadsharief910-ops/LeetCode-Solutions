class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];

        Stack<Integer> st = new Stack<>();

        for(int i =0; i<heights.length; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                
                st.pop();
            }
            if(st.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        Arrays.fill(nsr , n);

        for(int i =0; i<heights.length; i++) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()] ) {
                int idx = st.pop();
                nsr[idx] =i; 
            }
            st.push(i);
            
        }


        int maxArea = -1;

        for(int i =0; i<heights.length; i++) {
            int area = heights[i] * (nsr[i] - nsl[i] -1);
            maxArea = Math.max(maxArea , area);
        }
        return maxArea;

    }
}