package string;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

public class MaximumNestingDepthOfParenthesesAlterMethod {

    static class Solution {
        public int maxDepth(String s) {
            int maxDepth = 0;
            int count = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    count++;
                    maxDepth = Math.max(maxDepth, count);
                } else if (ch == ')') {
                    count--;
                }
            }
            return maxDepth;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str1 = "(1+(2*3)+((8)/4))+1";
        System.out.println(s.maxDepth(str1)); // 3

        String str2 = "(1)+((2))+(((3)))";
        System.out.println(s.maxDepth(str2)); // 3

        String str3 = "1+(2*3)/(2-1)";
        System.out.println(s.maxDepth(str3)); // 1
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)