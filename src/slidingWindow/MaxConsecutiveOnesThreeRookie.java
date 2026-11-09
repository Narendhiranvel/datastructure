package slidingWindow;
//https://leetcode.com/problems/max-consecutive-ones-iii/

public class MaxConsecutiveOnesThreeRookie {

    static class Solution {

        public int longestOnes(int[] nums, int k) {

            int maximumOnesCount = 0;
            int count = 0;
            int i = 0;
            int remainingFlips = k;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == 1) {
                    count++;
                } else {
                    remainingFlips--;

                    if (remainingFlips >= 0) {
                        count++;
                    }
                }

                // Shrink window if flips exceed k
                if (remainingFlips < 0) {

                    if (nums[i] == 0) {
                        remainingFlips++;
                    }

                    i++;
                }

                // Calculate valid window length
                count = j - i + 1;

                maximumOnesCount =
                        Math.max(maximumOnesCount, count);
            }

            return maximumOnesCount;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int result = solution.longestOnes(nums, k);

        System.out.println("Maximum consecutive ones: " + result);
    }
}

//Time Complexity O(n)
//Space Complexity O(1)