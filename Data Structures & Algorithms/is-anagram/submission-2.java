class Solution {
    public boolean isAnagram(String s, String t) {
        int[] result = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            result[ch-'a']++;
        }for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            result[ch-'a']--;
        }
        for(int i=0;i<result.length;i++){
            if(result[i]!=0) return false;
        }
        return true;
    }
}
