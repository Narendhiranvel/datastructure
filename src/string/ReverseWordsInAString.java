package string;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class ReverseWordsInAString {

    static class Solution {
        public String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");

            StringBuilder sb = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]);

                if (i != 0) {
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str1 = "the sky is blue";
        System.out.println(s.reverseWords(str1));

        String str2 = "  hello world  ";
        System.out.println(s.reverseWords(str2));

        String str3 = "a good   example";
        System.out.println(s.reverseWords(str3));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
