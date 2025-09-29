package Array;

//Pair with target sum in sorted array
//Input: [1,2,3,4,6], target=6
//Output: (2,4)

public class PairTargetSumAlternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        pairSum(arr, target);
    }

    private static void pairSum(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j < arr.length) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
                j++;
            }
        }
    }
}

// Time complexity O(n^2)
// Space complexity O(1)