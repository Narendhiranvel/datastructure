package binarySearchOnAnswer;

//https://leetcode.com/problems/find-k-th-smallest-pair-distance/

import java.util.Arrays;

public class FindKthSmallestPairDistance {

    static class Solution {

        public int smallestDistancePair(int[] nums, int k) {

            int n = nums.length;

            int maxPairs = (n * (n - 1)) / 2;
            if (k > maxPairs)
                return -1;

            Arrays.sort(nums);

            int start = 0; // min possible difference
            int end = nums[n - 1] - nums[0]; // max possible difference

            while (start < end) {

                int middle = start + (end - start) / 2;

                int count = countPairs(nums, middle);

                if (count >= k) {
                    end = middle;
                } else {
                    start = middle + 1;
                }
            }

            return start;
        }

        private int countPairs(int[] nums, int diff) {

            int count = 0;
            int left = 0;

            for (int right = 0; right < nums.length; right++) {

                while (nums[right] - nums[left] > diff) {
                    left++;
                }

                count += right - left;
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums1 = {1, 3, 1};
        int k1 = 1;
        System.out.println(s.smallestDistancePair(nums1, k1)); // 0

        int[] nums2 = {1, 1, 3, 4};
        int k2 = 2;
        System.out.println(s.smallestDistancePair(nums2, k2)); // 1

        int[] nums3 = {1, 6, 1};
        int k3 = 3;
        System.out.println(s.smallestDistancePair(nums3, k3)); // 5
    }
}

//Time Complexity  = O(n log n + n log W)
//Space Complexity = O(1)
