package string;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class ReverseWordsInAStringOp1 {

    static class Solution {
        public String reverseWords(String s) {

            s = s.trim();

            StringBuilder sb = new StringBuilder();

            // Remove extra spaces
            for (int i = 0; i < s.length(); i++) {
                if (i > 0) {
                    if (s.charAt(i) == ' ' && s.charAt(i - 1) == s.charAt(i)) {
                        continue;
                    }
                }
                sb.append(s.charAt(i));
            }

            int start = 0;
            int len = sb.length();

            // Reverse entire string
            reverse(sb, start, len - 1);

            // Reverse each word
            for (int i = 0; i < len; i++) {

                if (sb.charAt(i) == ' ') {
                    reverse(sb, start, i - 1);
                    start = i + 1;

                } else if (i == len - 1) {
                    reverse(sb, start, i);
                }
            }
            return sb.toString();
        }

        private void reverse(StringBuilder sb, int start, int end) {

            while (start < end) {
                char temp = sb.charAt(start);

                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);

                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        String str1 = "the sky is blue";
        System.out.println(s.reverseWords(str1));

        String str2 = "  hello   world  ";
        System.out.println(s.reverseWords(str2));

        String str3 = "a good example";
        System.out.println(s.reverseWords(str3));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)