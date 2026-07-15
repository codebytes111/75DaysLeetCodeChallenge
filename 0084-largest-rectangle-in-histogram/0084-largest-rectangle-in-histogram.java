class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = heights.length;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()] >=heights[i])){
                int height = heights[st.pop()];
                int right = i;
                int left;
                if(st.isEmpty())
                    left = -1;
                    else{
                        left = st.peek();
                    }
                    int width = right - left - 1;
                    max = Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;
    }
}