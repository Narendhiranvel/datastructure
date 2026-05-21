package greedyAlgorithmProblems;
//https://leetcode.com/problems/split-array-largest-sum/?utm_source=chatgpt.com
public class SplitArrayLargestSum {

    static class Solution {

        public int splitArray(int[] nums, int k) {
            int n = nums.length;
            if (k > n)
                return -1;

            int start = 0;
            int end = 0;

            // Find search space
            for (int num : nums) {
                start = Math.max(start, num);
                end += num;
            }

            int ans = -1;

            // Binary Search
            while (start <= end) {
                int middle = start + (end - start) / 2;

                if (canSplit(nums, k, middle)) {
                    ans = middle;
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }

            return ans;
        }

        private boolean canSplit(int[] nums, int k, int middle) {
            int split = 1;
            int splitSum = 0;

            for (int num : nums) {

                if (splitSum + num <= middle) {
                    splitSum += num;
                } else {
                    split++;
                    splitSum = num;
                }
            }

            return split <= k;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        int result = s.splitArray(nums, k);

        System.out.println("Minimum largest sum = " + result);
    }
}

//Time Complexity  = O(n log(sum(arr))) = = O(n log n)
//Space Complexity = O(1)