package string;
//https://leetcode.com/problems/isomorphic-strings/

import java.util.HashMap;

public class IsomorphicStrings {

    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;

            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character, Character> mapTS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                if (mapST.containsKey(c1) && mapST.get(c1) != c2) {
                    return false;
                }
                if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                    return false;
                }

                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str1 = "egg";
        String str2 = "add";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' isomorphic? " + s.isIsomorphic(str1, str2));

        String str3 = "foo";
        String str4 = "bar";
        System.out.println("Are '" + str3 + "' and '" + str4 + "' isomorphic? " + s.isIsomorphic(str3, str4));

        String str5 = "paper";
        String str6 = "title";
        System.out.println("Are '" + str5 + "' and '" + str6 + "' isomorphic? " + s.isIsomorphic(str5, str6));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
