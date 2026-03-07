package slidingWindow;
//https://www.geeksforgeeks.org/dsa/find-maximum-minimum-sum-subarray-size-k/

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int maxSum = findMaxSum(arr, k);
        System.out.println("Maximum Sum = " + maxSum);
    }

    public static int findMaxSum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int winStart = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = Math.max(maxSum, sum);

        for (int winEnd = k; winEnd < n; winEnd++) {
            sum += arr[winEnd] - arr[winStart];
            maxSum = Math.max(maxSum, sum);
            winStart++;
        }
        return maxSum;
    }
}

//Complexity
//Time: O(n)
//Space: O(1)
