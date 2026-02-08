package math;
//https://leetcode.com/problems/powx-n/description/

public class XPowN {

    static class Solution {
        public double myPow(double x, int n) {
            return Math.pow(x, n);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        double x1 = 2.0;
        int n1 = 10;
        System.out.println("2^10 = " + s.myPow(x1, n1));

        double x2 = 2.0;
        int n2 = -2;
        System.out.println("2^-2 = " + s.myPow(x2, n2));

        double x3 = 3.0;
        int n3 = 3;
        System.out.println("3^3 = " + s.myPow(x3, n3));
    }
}

// Time Complexity: O(log n)
// Space Complexity: 0(1)

