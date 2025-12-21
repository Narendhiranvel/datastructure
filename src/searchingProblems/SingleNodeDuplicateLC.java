package searchingProblems;

//Example:
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2

public class SingleNodeDuplicateLC {

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3};
        int result1 = singleNonDuplicate(nums1);
        System.out.println("Input: [1,1,2,3,3]");
        System.out.println("Output: " + result1);

        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        int result2 = singleNonDuplicate(nums2);
        System.out.println("\nInput: [3,3,7,7,10,11,11]");
        System.out.println("Output: " + result2);
    }
}

// Time Complexity: O(n)
 // Space Complexity: O(1)
