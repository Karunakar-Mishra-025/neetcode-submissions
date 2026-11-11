class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){
                return true;
            }
            arr.add(nums[i]);
        }
        return false;
    }
}