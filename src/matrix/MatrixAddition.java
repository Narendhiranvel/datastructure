package matrix;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] A = {{1, 2},
                     {3, 4}};

        int[][] B = {{5, 6},
                     {7, 8}};

        int[][] result = addMatrix(A, B);
        PrintMatrix.printMatric(result);
    }

    private static int[][] addMatrix(int[][] A, int[][] B) {
        int[][] addition = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                addition[i][j] = A[i][j] + B[i][j];
            }
        }
        return addition;
    }
}

//Time Complexity: O(n^2);
//Space Complext: O(n)
