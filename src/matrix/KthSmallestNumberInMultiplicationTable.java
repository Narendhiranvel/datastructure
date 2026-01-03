package matrix;

//https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/

public class KthSmallestNumberInMultiplicationTable {

    static class Solution {

        public int findKthNumber(int m, int n, int k) {
            int low = 1;
            int high = m * n;   // maximum possible value in the table

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (countLessOrEqual(mid, m, n) >= k) {
                    high = mid;     // mid could be the answer
                } else {
                    low = mid + 1;  // need larger values
                }
            }

            return low;
        }

        private int countLessOrEqual(int x, int m, int n) {
            int count = 0;

            for (int i = 1; i <= m; i++) {
                count += Math.min(n, x / i); // count numbers <= x in row i
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int m = 3; // number of rows
        int n = 3; // number of columns
        int k = 5; // find 5th smallest number

        int result = s.findKthNumber(m, n, k);
        System.out.println("The " + k + "th smallest number in " + m + "x" + n + " multiplication table is: " + result);
    }
}

//Time Complexity: O(m log(mn))
//Space Complexity : O(1)
