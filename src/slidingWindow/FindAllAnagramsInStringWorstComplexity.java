package slidingWindow;
//https://leetcode.com/problems/find-all-anagrams-in-a-string/description

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInStringWorstComplexity {

    static class Solution {

        public List<Integer> findAnagrams(String s, String p) {

            List<Integer> result = new ArrayList<>();

            if (p.length() > s.length()) {
                return result;
            }

            Map<Character, Integer> pMap = new HashMap<>();

            // Build frequency map for pattern
            for (int i = 0; i < p.length(); i++) {

                char ch = p.charAt(i);
                pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
            }

            StringBuilder sb = new StringBuilder();
            int windowLength = p.length();

            // Build initial window
            for (int i = 0; i < windowLength; i++) {
                sb.append(s.charAt(i));
            }

            Map<Character, Integer> sMap = new HashMap<>();

            // Calculate frequency of initial window
            for (int i = 0; i < windowLength; i++) {

                char ch = sb.charAt(i);
                sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
            }

            if (sMap.equals(pMap)) {
                result.add(0);
            }

            // Slide window and rebuild frequency map
            for (int i = windowLength; i < s.length(); i++) {

                sb.deleteCharAt(0);
                sb.append(s.charAt(i));

                Map<Character, Integer> sMap2 = new HashMap<>();

                for (int j = 0; j < sb.length(); j++) {

                    char ch = sb.charAt(j);
                    sMap2.put(ch, sMap2.getOrDefault(ch, 0) + 1);
                }

                if (sMap2.equals(pMap)) {
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

// Time Complexity: O(n * m)
// Auxiliary Space Complexity: O(m)
// Result Space Complexity: O(n)
