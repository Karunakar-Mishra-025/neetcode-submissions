class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int r=0,l=0;
        while(r<s2.length() && l<=s2.length()){
            if(r-l+1 >k){ 
                l++;
                continue;
            }
            String temp= s2.substring(l,r+1);
            if(isAnagram(s1,temp)) return true;
            r++;
        }
        return false;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}
