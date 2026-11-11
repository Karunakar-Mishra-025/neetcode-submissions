class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();

		for(char ch : s.toLowerCase().toCharArray())
		{
		if(Character.isLetterOrDigit(ch)) {
		sb.append(ch);
		}
		}

		return sb.toString().equals(sb.reverse().toString());
    }
}
