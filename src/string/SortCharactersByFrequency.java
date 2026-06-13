package string;

//https://leetcode.com/problems/sort-characters-by-frequency/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

    static class Solution {
        public String frequencySort(String s) {

            Map<Character, Integer> freqMap = new HashMap<>();

            for (char ch : s.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            List<Character> list = new ArrayList<>(freqMap.keySet());
            list.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

            StringBuilder sb = new StringBuilder();

            for (char c : list) {
                int count = freqMap.get(c);
                sb.append(String.valueOf(c).repeat(count));
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str1 = "tree";
        System.out.println(s.frequencySort(str1));

        String str2 = "cccaaa";
        System.out.println(s.frequencySort(str2));

        String str3 = "Aabb";
        System.out.println(s.frequencySort(str3));
    }
}

//Time Complexity: O(n + k log k)
//Space Complexity: O(n)