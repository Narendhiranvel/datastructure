package string;

//https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramHasMap {

    static class Solution {
        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length())
                return false;

            Map<Character, Integer> sMap = new HashMap<>();
            Map<Character, Integer> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char s1 = s.charAt(i);
                char t1 = t.charAt(i);

                sMap.put(s1, sMap.getOrDefault(s1, 0) + 1);
                tMap.put(t1, tMap.getOrDefault(t1, 0) + 1);
            }

            for (int i = 0; i < t.length(); i++) {
                char t1 = t.charAt(i);

                if (!sMap.containsKey(t1) ||
                        !sMap.get(t1).equals(tMap.get(t1))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isAnagram("listen", "silent")); // true
        System.out.println(s.isAnagram("rat", "car"));       // false
        System.out.println(s.isAnagram("aacc", "ccac"));     // false
    }
}
