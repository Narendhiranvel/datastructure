package Array;

//Maximum sum subarray of size k
//Input: [2,1,5,1,3,2], k=3
//Output: 9 ([5,1,3])

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int subArrSum = 0;
            for (int j = i; j < i + k; j++) {
                subArrSum += arr[j];
            }
            if (subArrSum > maxSum) {
                maxSum = subArrSum;
                startIndex = i;
            }
        }
        System.out.println("Max Sum = " + maxSum);
        System.out.print("Subarray = ");
        for (int j = startIndex; j < startIndex + k; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

// Time Complexity O(n^2)
// Space Complexity O(1)
