package string;

//https://leetcode.com/problems/sort-characters-by-frequency/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

    static class Solution {
        public String frequencySort(String s) {

            int n = s.length();

            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            StringBuilder sb = new StringBuilder();

            for (Map.Entry<Character, Integer> entry : list) {

                char ch = entry.getKey();
                int frequency = entry.getValue();

                for (int i = 0; i < frequency; i++) {
                    sb.append(ch);
                }
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