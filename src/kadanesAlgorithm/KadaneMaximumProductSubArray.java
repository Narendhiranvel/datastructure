package kadanesAlgorithm;

//https://leetcode.com/problems/maximum-product-subarray/description/

public class KadaneMaximumProductSubArray {

    static class Solution {
        public int maxProduct(int[] nums) {

            int n = nums.length;

            int maxProductSum = nums[0];
            int minProductSum = nums[0];
            int result = nums[0];

            for (int i = 1; i < n; i++) {
                int num = nums[i];

                int tempMax = Math.max(num,
                        Math.max(maxProductSum * num, minProductSum * num));

                int tempMin = Math.min(num,
                        Math.min(maxProductSum * num, minProductSum * num));

                maxProductSum = tempMax;
                minProductSum = tempMin;

                result = Math.max(result, maxProductSum);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Max Product: " + s.maxProduct(nums1)); // 6

        int[] nums2 = {-2, 0, -1};
        System.out.println("Max Product: " + s.maxProduct(nums2)); // 0

        int[] nums3 = {-2, 3, -4};
        System.out.println("Max Product: " + s.maxProduct(nums3)); // 24
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
