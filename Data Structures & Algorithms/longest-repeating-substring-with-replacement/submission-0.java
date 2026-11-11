class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int l = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int r = 0; r < s.length(); r++) {

            // Add current character
            freq[s.charAt(r) - 'A']++;

            // Maximum frequency inside window
            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(r) - 'A']
            );

            // If replacements needed > k
            while ((r - l + 1) - maxFreq > k) {

                freq[s.charAt(l) - 'A']--;
                l++;
            }

            // Current window is valid
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
