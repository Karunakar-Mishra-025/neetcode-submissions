class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int left[] = new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++){
            left[i] = product;
            product *= nums[i];
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=product*left[i];
            product*=nums[i];
        }
        return res;
    }
}  
