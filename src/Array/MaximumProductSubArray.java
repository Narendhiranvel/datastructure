package Array;

//https://leetcode.com/problems/maximum-product-subarray/submissions/1887916969/
public class MaximumProductSubArray {

    static class Solution {
        public int maxProduct(int[] nums) {
            int maxProduct = Integer.MIN_VALUE;
            int currentProduct = 1;

            // Left to right traversal
            for (int i = 0; i < nums.length; i++) {
                currentProduct *= nums[i];
                maxProduct = Math.max(maxProduct, currentProduct);

                if (currentProduct == 0) {
                    currentProduct = 1;
                }
            }

            currentProduct = 1;

            // Right to left traversal
            for (int i = nums.length - 1; i >= 0; i--) {
                currentProduct *= nums[i];
                maxProduct = Math.max(maxProduct, currentProduct);

                if (currentProduct == 0) {
                    currentProduct = 1;
                }
            }

            return maxProduct;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 3, -2, 4}; // sample input
        int result = s.maxProduct(nums);

        System.out.println("Maximum Product Subarray = " + result);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
