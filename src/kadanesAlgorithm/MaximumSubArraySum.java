package kadanesAlgorithm;

//Maximum subarray sum (Kadane’s Algo)
//Input: [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6 ([4,-1,2,1])

public class MaximumSubArraySum {
    private static int findMaxSubArray(int[] arr) {
        int n = arr.length;
        int subArrSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            subArrSum = Math.max(currentSum, subArrSum);
        }
        return subArrSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSubArray(arr));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
