package search;

public class SearchInRotatedSortedArray {

    /**
     * Search target in a rotated sorted array with duplicates.
     * <p>
     * Time Complexity:
     * - Average: O(log n)
     * - Worst case: O(n) when many duplicates exist
     * <p>
     * Space Complexity:
     * - O(1): constant extra space
     */
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: found target
            if (nums[mid] == target) {
                return true;
            }

            // Case 2: duplicates block decision
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // Case 3: left half is sorted
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Case 4: right half is sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    // HARD CODED INPUT + OUTPUT
    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 1};  // <-- your rotated array
        int target = 0;                // <-- your target value

        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        boolean result = obj.search(nums, target);

        System.out.println("Target found? " + result);
    }
}

