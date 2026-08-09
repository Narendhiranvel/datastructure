package slidingWindow;

//https://leetcode.com/problems/count-number-of-nice-subarrays/description/

public class CountNoOfNiceSubarraysSW {

    static class Solution {
        public int numberOfSubarrays(int[] nums, int k) {

            int left = 0;
            int oddCount = 0;
            int evenCount = 0;
            int result = 0;

            for (int right = 0; right < nums.length; right++) {

                if (nums[right] % 2 != 0) {
                    oddCount++;
                }

                while (oddCount > k) {

                    if (nums[left] % 2 != 0) {
                        oddCount--;
                        evenCount = 0;
                    }
                    left++;
                }

                if (oddCount == k) {

                    while (nums[left] % 2 == 0) {
                        evenCount++;
                        left++;
                    }
                    result += evenCount + 1;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums1 = {1, 1, 2, 1, 1};
        int k1 = 3;

        System.out.println(s.numberOfSubarrays(nums1, k1)); // 2

        int[] nums2 = {2, 4, 6};
        int k2 = 1;

        System.out.println(s.numberOfSubarrays(nums2, k2)); // 0

        int[] nums3 = {2, 2, 1, 2, 2, 1, 2};
        int k3 = 1;

        System.out.println(s.numberOfSubarrays(nums3, k3)); // 9
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
