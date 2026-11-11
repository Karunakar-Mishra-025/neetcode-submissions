class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct=new int[nums.length];
        int product =1;
        for(int i=0;i<nums.length;i++){
            leftProduct[i]=product;
            product*=nums[i];
        }
        int ans[] = new int[nums.length];
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=leftProduct[i]*product;
            product*=nums[i];
        } 
        return ans;
    }
}  
