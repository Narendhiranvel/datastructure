package search;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;  // correct insert position
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6, 9, 10};
        int target = 7;

        System.out.println("Input Array:");
        for (int n : nums) System.out.print(n + " ");
        System.out.println("\nTarget: " + target);

        int result = searchInsert(nums, target);

        System.out.println("Output: " + result);
    }
}

//Time Complexity : O(log n)
//Space Complexity: O(1)

