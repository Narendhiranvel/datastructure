package searchingProblems;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class BS_E_M_SearchInRotatedSortedArray {

    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] == target) {
                return true;
            }
            if (nums[start] == nums[middle] && nums[middle] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] <= nums[middle]) {
                if (nums[start] <= target && target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (nums[middle] < target && target <= nums[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return false;
    }

    // HARD CODED INPUT + OUTPUT
    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 1};  // <-- your rotated array
        int target = 0;                // <-- your target value

        BS_E_M_SearchInRotatedSortedArray obj = new BS_E_M_SearchInRotatedSortedArray();
        boolean result = obj.search(nums, target);

        System.out.println("Target found? " + result);
    }
}

/**
 * Search target in a rotated sorted array with duplicates.
 * Time Complexity:
 * - Average: O(log n)
 * - Worst case: O(n) when many duplicates exist
 * Space Complexity:
 * - O(1): constant extra space
 */

