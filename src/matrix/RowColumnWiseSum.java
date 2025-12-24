package matrix;

public class RowColumnWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6}};
        sumRowsColumns(matrix);

    }

    public static void sumRowsColumns(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row Sum " + "[" + i + "]" + " =" + rowSum);
        }
        for (int i = 0; i < arr[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < arr.length; j++) {
                columnSum += arr[j][i];
            }
            System.out.println("Column Sum " + "[" + i + "]" + " =" + columnSum);
        }
    }
}

//Time Complexity: (O(n^2) + O(n^2)) = O(n^2)
//Space Complexity: O(1)
