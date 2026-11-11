class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!ans.empty() && ((ch==')' && ans.peek()=='(') || (ch==']' && ans.peek()=='[')  || (ch=='}' && ans.peek()=='{'))){
                ans.pop();
            }else{
                ans.push(ch);
            }
        }
        return ans.empty();
    }
}
