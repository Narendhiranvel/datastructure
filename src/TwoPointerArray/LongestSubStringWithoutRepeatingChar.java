package TwoPointerArray;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int start = 0;
            int maxLength = 0;
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    start = Math.max(start, map.get(c) + 1);
                }
                map.put(c, i);
                maxLength = Math.max(maxLength, i - start + 1);
            }
            return maxLength;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "abcabcbb";
        int result = s.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring: " + result);
    }
}

//Time Complexity O(n)
//Space Complexity O(n)
