package searchingProblems;
//https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchATwoDMatrixOne {

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {

            for (int i = 0; i < matrix.length; i++) {

                int leftStart = 0;
                int rightEnd = matrix[0].length - 1;

                while (leftStart <= rightEnd) {
                    int middle = leftStart + (rightEnd - leftStart) / 2;

                    if (matrix[i][middle] == target) {
                        return true;
                    } else if (matrix[i][middle] < target) {
                        leftStart = middle + 1;
                    } else {
                        rightEnd = middle - 1;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        boolean found = s.searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}

// Time Complexity: O(m log n)
// Space Complexity: O(1)
