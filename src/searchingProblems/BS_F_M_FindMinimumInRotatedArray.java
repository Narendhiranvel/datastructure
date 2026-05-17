package searchingProblems;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class BS_F_M_FindMinimumInRotatedArray {

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] < nums[end]) {
                end = middle;
            } else if (nums[middle] > nums[end]) {
                start = middle + 1;
            } else {
                end--;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 1, 3};
//     {2,0,1,1,1}
//        1,1,1,0,1
        BS_F_M_FindMinimumInRotatedArray f = new BS_F_M_FindMinimumInRotatedArray();
        System.out.println("Smallest element " + f.findMin(nums));
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

