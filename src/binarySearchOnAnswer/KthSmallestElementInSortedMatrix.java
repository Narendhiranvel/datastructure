package binarySearchOnAnswer;

//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

public class KthSmallestElementInSortedMatrix {

    static class Solution {

        public int kthSmallest(int[][] matrix, int k) {

            int n = matrix.length;

            int low = matrix[0][0];
            int high = matrix[n - 1][n - 1];

            while (low < high) {

                int mid = low + (high - low) / 2;

                int count = countLessEqual(matrix, mid);

                if (count >= k) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            return low;
        }

        private int countLessEqual(int[][] matrix, int mid) {

            int n = matrix.length;
            int row = n - 1;
            int col = 0;

            int count = 0;

            while (row >= 0 && col < n) {

                if (matrix[row][col] <= mid) {
                    count += (row + 1);
                    col++;
                } else {
                    row--;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] matrix1 = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

        System.out.println(s.kthSmallest(matrix1, 8)); // 13

        int[][] matrix2 = {
                {1, 2},
                {1, 3}
        };

        System.out.println(s.kthSmallest(matrix2, 3)); // 2
    }
}

//Time Complexity = O(n · log(max - min))
//Time Complexity = O(1)
