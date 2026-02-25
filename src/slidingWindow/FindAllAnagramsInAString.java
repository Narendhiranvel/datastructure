package slidingWindow;
//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

import java.util.*;

public class FindAllAnagramsInAString {

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();

            if (s.length() < p.length()) return result;
            int[] pCount = new int[26];
            int[] sCount = new int[26];

            int pLen = p.length();
            for (char c : p.toCharArray()) {
                pCount[c - 'a']++;
            }
            for (int i = 0; i < s.length(); i++) {
                sCount[s.charAt(i) - 'a']++;
                if (i >= pLen) {
                    sCount[s.charAt(i - pLen) - 'a']--;
                }
                if (Arrays.equals(sCount, pCount)) {
                    result.add(i - pLen + 1);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = sol.findAnagrams(s, p);
        System.out.println("Anagram starting indices: " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
