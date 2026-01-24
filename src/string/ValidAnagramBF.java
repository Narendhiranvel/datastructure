package string;
//https://leetcode.com/problems/valid-anagram/
import java.util.Arrays;

public class ValidAnagramBF {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();

            if (sChar.length != tChar.length) {
                return false;
            }
            int n = sChar.length;

            for (int i = 0; i < n; i++) {
                int flag = 0;
                for (int j = 0; j < n; j++) {
                    if (sChar[i] == tChar[j]) {
                        tChar[j] = '@'; // mark as used
                        flag = 1;
                        break;
                    }
                }
                if (flag != 1) {
                    return false;
                }
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

// Time Complexity: O(n²)
// Space Complexity: O(n)
