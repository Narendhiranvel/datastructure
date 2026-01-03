package Array;

import java.util.Arrays;

public class NextPermutation {

    static class Solution {

        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int pivot = -1;

            // 1. Find pivot
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    pivot = i;
                    break;
                }
            }

            // 2. Swap with next greater element
            if (pivot != -1) {
                for (int i = n - 1; i > pivot; i--) {
                    if (nums[i] > nums[pivot]) {
                        swap(nums, i, pivot);
                        break;
                    }
                }
            }

            // 3. Reverse suffix
            reverse(nums, pivot + 1, n - 1);
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start++, end--);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1, 2, 3}; // sample input
        System.out.println("Original: " + Arrays.toString(nums));

        s.nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));

        // Example: apply next permutation again
        s.nextPermutation(nums);
        System.out.println("Next Permutation again: " + Arrays.toString(nums));
    }
}

// Time Complexity O(n)
// Space complexity O(1)

