package slidingWindow;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

import java.util.*;

public class FindAllAnagramsInAStringHashMap {

    static class Solution {

        public List<Integer> findAnagrams(String s, String p) {

            List<Integer> result = new ArrayList<>();

            if (p.length() > s.length()) {
                return result;
            }

            int windowLength = p.length();

            Map<Character, Integer> pMap = new HashMap<>();
            Map<Character, Integer> sMap = new HashMap<>();

            // Build both frequency maps
            for (int i = 0; i < windowLength; i++) {

                char pChar = p.charAt(i);
                char sChar = s.charAt(i);

                pMap.put(pChar, pMap.getOrDefault(pChar, 0) + 1);
                sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
            }

            if (sMap.equals(pMap)) {
                result.add(0);
            }

            // Sliding window
            for (int i = windowLength; i < s.length(); i++) {

                char rem = s.charAt(i - windowLength);
                char ch = s.charAt(i);

                // Remove outgoing character
                if (sMap.get(rem) > 1) {
                    sMap.put(rem, sMap.get(rem) - 1);
                } else {
                    sMap.remove(rem);
                }

                // Add incoming character
                sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

                // Compare frequency maps
                if (sMap.equals(pMap)) {
                    result.add(i - windowLength + 1);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = solution.findAnagrams(s, p);

        System.out.println("Anagram starting indices: " + result);
    }
}

// Time Complexity: O(n * d) expected
// Auxiliary Space Complexity: O(d)
// n = s.length()
// d = number of distinct characters across the two maps
