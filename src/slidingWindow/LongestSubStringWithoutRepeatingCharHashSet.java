package slidingWindow;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharHashSet {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {

            HashSet<Character> set = new HashSet<>();

            int left = 0;
            int max = 0;

            for (int right = 0; right < s.length(); right++) {

                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharHashSet.Solution s = new LongestSubStringWithoutRepeatingCharHashSet.Solution();
        String input = "abcabcbb";
        int result = s.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring: " + result);
    }
}

//Time Complexity O(n)
//Space Complexity O(n)
