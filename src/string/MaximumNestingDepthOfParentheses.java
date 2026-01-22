package string;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
public class MaximumNestingDepthOfParentheses {

    static class Solution {
        public int maxDepth(String s) {
            int maxNoParan = 0;
            int count = 0;
            char[] c = s.toCharArray();

            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(') {
                    count++;
                    if (count > maxNoParan) {
                        maxNoParan = count;
                    }
                } else if (c[i] == ')') {
                    count--;
                }
            }
            return maxNoParan;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String input = "(1+(2*3)+((8)/4))+1";
        int result = s.maxDepth(input);

        System.out.println(result);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)

