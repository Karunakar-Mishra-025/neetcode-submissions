class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l, map.get(s.charAt(r)) + 1);
                map.put(s.charAt(r),r);
                ans=Math.max(((r-l)+1),ans);
                r++;
            }else{
                map.put(s.charAt(r),r);
                ans=Math.max(((r-l)+1),ans);
                r++;
            }
        }
        return ans;
    }
}