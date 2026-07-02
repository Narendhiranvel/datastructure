package TwoPointerArray;

//Rotate array (by k positions)
//Input: arr = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

import java.util.Arrays;

public class RotateArrayKPositions {
    static class Solution {

        public void rotate(int[] nums, int k) {

            int n = nums.length;
            k = k % n;

            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
        }

        private void reverse(int[] nums, int left, int right) {
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;

        s.rotate(nums1, k1);
        System.out.println("Rotated array: " + Arrays.toString(nums1));

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;

        s.rotate(nums2, k2);
        System.out.println("Rotated array: " + Arrays.toString(nums2));
    }
}

//Time Complexity: O(n) (3 reversals, each O(n))
//Space Complexity: O(1) (in-place swaps only)
