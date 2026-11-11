class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            for(int j=heights.length-1;j>i;j--){
            int capacity =Math.min(heights[i],heights[j])*(j-i);
            if(capacity>max) max=capacity;
            }
        }
        return max;
    }
}
