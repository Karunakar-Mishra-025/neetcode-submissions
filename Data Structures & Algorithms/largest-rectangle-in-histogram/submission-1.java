class Solution {
    public int largestRectangleArea(int[] heights) {
        // int result=0;
        // for(int i=0;i<heights.length;i++){
        //     int r=i+1,l=i-1;
        //     int height = heights[i];
        //     int width = 1;
        //     while(r<heights.length){
        //         if(heights[r]>=height){
        //             r++;
        //             width++;
        //         }else break;
        //     }
        //     while(l>=0){
        //         if(heights[l]>=height){
        //             l--;
        //             width++;
        //         }else break;
        //     }
        //     result=Math.max(result,(height*width));
        // }
        // return result;
        int n = heights.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        int[] nse = new int[n];
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&
                heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
