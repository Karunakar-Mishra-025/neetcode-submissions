class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int s1[]=new int[128],s2[]=new int[128];
        for(int i=0;i<s.length();i++){
            s1[s.charAt(i)]++;
            s2[t.charAt(i)]++;
        }
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}
