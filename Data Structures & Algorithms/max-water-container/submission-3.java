class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        // for(int i=0;i<heights.length;i++){
        //     int j=nums.length-1;
        //     int capacity =Math.min(heights[i],heights[j])*(j-i);
        //     if(capacity>max) max=capacity;
        //     if(capacity<max)
        // }
        int i = 0;
        int j = heights.length - 1;

        while (i < j) {
            int smaller = Math.min(heights[i], heights[j]);
            int capacity = smaller * (j - i);
            max = Math.max(max, capacity);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
