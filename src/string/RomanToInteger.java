package string;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    static class Solution {
        public int romanToInt(String s) {
            int total = 0;

            for (int i = 0; i < s.length(); i++) {
                int curr = value(s.charAt(i));
                int next = (i + 1 < s.length()) ? value(s.charAt(i + 1)) : 0;

                if (curr < next) {
                    total -= curr;
                } else {
                    total += curr;
                }
            }
            return total;
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

        String roman = "MCMXCIV"; // sample input
        int result = s.romanToInt(roman);

        System.out.println(result);
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
