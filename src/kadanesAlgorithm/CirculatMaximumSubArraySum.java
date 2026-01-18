package kadanesAlgorithm;

public class CirculatMaximumSubArraySum {

    static class Solution {
        public int maxCircularSum(int[] arr) {
            int n = arr.length;

            int totalSum = arr[0];

            int currentMaxSum = arr[0];
            int maxSubArrSum = arr[0];

            int currentMinSum = arr[0];
            int minSubArrSum = arr[0];

            for (int i = 1; i < n; i++) {
                int num = arr[i];

                totalSum += num;

                currentMaxSum = Math.max(num, currentMaxSum + num);
                maxSubArrSum = Math.max(maxSubArrSum, currentMaxSum);

                currentMinSum = Math.min(num, currentMinSum + num);
                minSubArrSum = Math.min(minSubArrSum, currentMinSum);
            }

            // All numbers are negative
            if (maxSubArrSum < 0) {
                return maxSubArrSum;
            }

            return Math.max(maxSubArrSum, totalSum - minSubArrSum);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {8, -1, 3, 4};   // sample input
        int result = s.maxCircularSum(arr);

        System.out.println("Maximum Circular Subarray Sum = " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
