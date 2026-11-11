class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int right = matrix.length * matrix[0].length - 1;
        int left=0;
        while(right>=left){
            int position = left + (right - left) / 2;
            int row = position / matrix[0].length;
            int col = position % matrix[0].length;
            if(matrix[row][col]==target) {
                return true;
            }
            else if(matrix[row][col]>target){
                right=position-1;
            }else left=position+1;
        }
        return false;
    }
}
