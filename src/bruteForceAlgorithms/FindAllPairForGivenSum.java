package bruteForceAlgorithms;

//Problem: Print all pairs of elements that sum to a target.
//Input: arr = [1, 2, 3, 4, 5], target = 5
//Output: (1, 4), (2, 3)

public class FindAllPairForGivenSum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int target = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Sum of " + arr[i] + " + " + arr[j] + " is " + (arr[i] + arr[j]));
                }
            }
        }
    }
}
