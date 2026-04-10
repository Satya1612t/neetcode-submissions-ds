class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0, maxFreq = 0, maxLen = 0;
        int[] count = new int[26];

        for(int right = 0; right < s.length(); right++){

            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(count[s.charAt(right) - 'A'], maxFreq);

            if((right - left + 1) - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max((right - left + 1), maxLen);
        }
        return maxLen;
    }
}