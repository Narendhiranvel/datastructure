package searchingProblems;
//https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1958596827/
//Example:
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2

public class BS_D_M_SingleElementInSortedArrayLC {

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;

            if ((middle % 2 == 0 && nums[middle] == nums[middle + 1]) || (middle % 2 != 0 && nums[middle] != nums[middle + 1])) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int result1 = singleNonDuplicate(nums1);
        System.out.println("Input: [1,1,2,3,3,4,4,8,8]");
        System.out.println("Output: " + result1);

        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        int result2 = singleNonDuplicate(nums2);
        System.out.println("\nInput: [3,3,7,7,10,11,11]");
        System.out.println("Output: " + result2);
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)
