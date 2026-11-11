class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans=new LinkedList<>();
        // boolean isChecked[]=new boolean[strs.length];
        // for(int i=0;i<strs.length;i++){
        //     if(isChecked[i]) continue;
        //     List<String> temp=new LinkedList<>();
        //     temp.add(strs[i]);
        //     for(int j=i+1;j<strs.length;j++){
        //         if(isAnagram(strs[i],strs[j])){
        //             temp.add(strs[j]);
        //             isChecked[j]=true;
        //         }
        //     }
        //     ans.add(temp);
        // }
        // return ans;
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
                char ch[]=str.toCharArray();
                Arrays.sort(ch);
                String sortedstr=new String(ch);
                map.putIfAbsent(sortedstr,new ArrayList<>());
                map.get(sortedstr).add(str);
        }
        return new ArrayList<>(map.values());

    }
    // public boolean isAnagram(String str1,String str2){
    //     if(str1.length()!=str2.length()) return false;
    //     int temp1[]=new int[128];
    //     int temp2[]=new int[128];
    //     for(int i=0;i<str1.length();i++){
    //         temp1[str1.charAt(i)]+=1;
    //         temp2[str2.charAt(i)]+=1;
    //     }
    //     for(int i=0;i<temp1.length;i++){
    //         if(temp1[i]!=temp2[i]) return false;
    //     }
    //     return true;
    // }
}
