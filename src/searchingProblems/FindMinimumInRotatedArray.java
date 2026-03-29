package searchingProblems;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class FindMinimumInRotatedArray {

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            if(nums[mid] > nums[end]){
                start = mid + 1;
            } else if(nums[mid] < nums[start]){
                end = mid;
            } else {
                end = mid;
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

