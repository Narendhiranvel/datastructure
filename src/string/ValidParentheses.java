package string;

//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParentheses {

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str1 = "()";
        System.out.println(str1 + " -> " + s.isValid(str1)); // true

        String str2 = "()[]{}";
        System.out.println(str2 + " -> " + s.isValid(str2)); // true

        String str3 = "(]";
        System.out.println(str3 + " -> " + s.isValid(str3)); // false

        String str4 = "([)]";
        System.out.println(str4 + " -> " + s.isValid(str4)); // false

        String str5 = "{[]}";
        System.out.println(str5 + " -> " + s.isValid(str5)); // true
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
