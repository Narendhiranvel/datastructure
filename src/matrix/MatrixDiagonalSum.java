package matrix;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        diagonalSum(matrix);
    }

    public static void diagonalSum(int[][] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }

        if (arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Matrix cannot be empty");
        }

        if (arr.length != arr[0].length) {
            throw new IllegalArgumentException(
                    "Diagonal sum is defined only for a square matrix"
            );
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    primaryDiagonalSum += arr[i][j];
                }
                if ((i + j) == arr.length - 1) {
                    secondaryDiagonalSum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of primary diagonal of matrix: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal of matrix: " + secondaryDiagonalSum);
    }
}

//Time Complexity: O(n^2);
//Space Complexity: O(1)
