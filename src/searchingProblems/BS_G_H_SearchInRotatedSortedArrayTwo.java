package searchingProblems;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class BS_G_H_SearchInRotatedSortedArrayTwo {

    static class Solution {
        public int findMin(int[] nums) {
            int start = 0;
            int end = nums.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;

                // Handle duplicates
                if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                    start++;
                    end--;
                    continue;
                }
                if (nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return nums[start];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 2, 2, 0, 1};
        int result = s.findMin(nums);

        System.out.println("Minimum element: " + result);
    }
}
