package matrix;

import static matrix.PrintMatrix.printMatrix;

public class RotateMatrixNinety {
    public static void main(String[] args) {
        int[][] matrix = {{1,   2,  3,  4},
                          {5,   6,  7,  8},
                          {9,  10, 11, 12},
                          {13, 14, 15 ,16}};
        System.out.println("Before 90 degree rotation ");
        printMatrix(matrix);

        rotateMatrix(matrix);
        System.out.println("After 90 degree rotation ");
        printMatrix(matrix);
    }

    public static void rotateMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
                left++;
                right--;
            }
        }
    }
}

//Time Complexity: (O(n^2) + O(n)) = O(n^2)
//Space Complexity: O(1)
