package bruteForceAlgorithms;

//Problem: Determine if any two elements in an array are the same.
//        Input: [1, 2, 3, 4, 2]
//Output: Yes (Duplicate found: 2)

public class CheckForDuplicateNo {
    public static void main(String[] args) {
        int[] arr = {54, 7, 99, 11, 89, 5, 11, 64, 5, 25};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found " + (j+1));
                }
            }
        }
    }
}
