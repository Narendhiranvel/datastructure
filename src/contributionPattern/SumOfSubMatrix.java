package contributionPattern;
// https://www.geeksforgeeks.org/dsa/sum-of-all-submatrices-of-a-given-matrix/
public class SumOfSubMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        System.out.println(subMatrixSum(matrix));
    }

    private static int subMatrixSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j] * (i + 1) * (j + 1) * (m - i) * (n - j);
            }
        }
        return sum;
    }
}
//Time Complexity: O(n*m)
//Space Complexity : O(1)