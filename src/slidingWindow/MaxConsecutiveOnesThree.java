package slidingWindow;
//https://leetcode.com/problems/max-consecutive-ones-iii/description/

public class MaxConsecutiveOnesThree {

    static class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0;
            int zeroCount = 0;
            int maxLength = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeroCount++;
                }
                // Shrink window if zeroCount exceeds k
                if (zeroCount > k) {
                    if (nums[left] == 0) {
                        zeroCount--;
                    }
                    left++;
                }
                maxLength = Math.max(maxLength, right - left + 1);
            }
            return maxLength;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int result = s.longestOnes(nums, k);
        System.out.println("Maximum consecutive ones after flipping at most "
                + k + " zeros = " + result);
    }
}

//Time Complexity O(n)
//Space Complexity O(1)
