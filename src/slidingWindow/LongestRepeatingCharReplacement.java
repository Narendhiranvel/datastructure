package slidingWindow;
//https://leetcode.com/problems/longest-repeating-character-replacement/submissions/1935029819/

public class LongestRepeatingCharReplacement {

    static class Solution {
        public int characterReplacement(String s, int k) {
            int n = s.length();
            int left = 0;
            int maxFreq = 0;
            int maxLen = 0;
            int[] count = new int[26];

            for (int right = 0; right < n; right++) {
                char c = s.charAt(right);

                count[c - 'A']++;
                maxFreq = Math.max(maxFreq, count[c - 'A']);
                // If replacements needed > k, shrink window
                while ((right - left + 1) - maxFreq > k) {
                    count[s.charAt(left) - 'A']--;
                    left++;
                }
                maxLen = Math.max(maxLen, right - left + 1);
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "AABABBA";
        int k = 1;
        int result = s.characterReplacement(str, k);
        System.out.println("Longest length after replacement: " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)