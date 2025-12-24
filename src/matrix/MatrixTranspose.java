package matrix;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6}};
        transposeMatrix(matrix);
    }

    private static void transposeMatrix(int[][] A) {
        int rows = A.length;        // m
        int cols = A[0].length;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(n^2);
//Space Complexity: O(1)
