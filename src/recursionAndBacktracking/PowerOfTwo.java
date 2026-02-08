package recursionAndBacktracking;
//https://leetcode.com/problems/power-of-two/description/

public class PowerOfTwo {

    static class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            if (n == 1) return true;
            if (n % 2 != 0) return false;
            return isPowerOfTwo(n / 2);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] testCases = {1, 2, 3, 4, 16, 18, 32, 0, -8};

        for (int n : testCases) {
            System.out.println(n + " is power of two? " + sol.isPowerOfTwo(n));
        }
    }
}

//Time Complexity: O(log n)
//Space Complexity: O(log 1)
