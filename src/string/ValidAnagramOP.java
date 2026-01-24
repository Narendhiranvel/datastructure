package string;
//https://leetcode.com/problems/valid-anagram/submissions/1895759811/

import java.util.Arrays;

public class ValidAnagramOP {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] freq = new int[26]; // only lowercase letters

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++; // increment for s
                freq[t.charAt(i) - 'a']--; // decrement for t
            }

            for (int count : freq) {
                if (count != 0) return false;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str1 = "listen";
        String str2 = "silent";
        System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams? " + s.isAnagram(str1, str2));

        String str3 = "hello";
        String str4 = "bello";
        System.out.println("'" + str3 + "' and '" + str4 + "' are anagrams? " + s.isAnagram(str3, str4));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

