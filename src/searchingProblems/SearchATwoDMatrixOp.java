package searchingProblems;
//https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchATwoDMatrixOp {

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            int row = 0;
            int col = cols - 1;

            while (row < rows && col >= 0) {
                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] > target) {
                    col--;
                } else {
                    row++;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 5;

        boolean result = s.searchMatrix(matrix, target);
        System.out.println(result);
    }
}
// Time Complexity: O(rows + cols)
// Space Complexity: O(1)