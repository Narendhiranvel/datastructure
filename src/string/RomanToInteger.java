package string;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    static class Solution {
        public int romanToInt(String s) {

            int n = s.length();
            int sum = 0;

            int i = 0;

            while (i < n) {

                char ch = s.charAt(i);

                if (i + 1 < n && value(ch) < value(s.charAt(i + 1))) {
                    sum += (value(s.charAt(i + 1)) - value(ch));
                    i += 2;
                } else {
                    sum += value(ch);
                    i++;
                }
            }
            return sum;
        }

        private int value(char c) {
            switch (c) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String roman = "MCMLXXXVII"; // sample input
        int result = s.romanToInt(roman);

        System.out.println(result);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
