package search;

public class FindMinimumInRotatedArray {

    public int findMin(int[] nums) {
        int minimumValue = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] > nums[end]) {
                start = middle + 1;
            } else if (nums[middle] < nums[end]) {
                end = middle;
            } else {
                end = end - 1;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 1};
//     {2,0,1,1,1}
//        1,1,1,0,1
        FindMinimumInRotatedArray f = new FindMinimumInRotatedArray();
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

