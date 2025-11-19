package search;

public class FindFirstAndLastPositionOfNumberInSortedArray {

    // Binary search to find the FIRST index of target
    public static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                first = mid;      // possible answer
                right = mid - 1;  // move left to find earlier occurrence
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Binary search to find the LAST index of target
    public static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                last = mid;      // possible answer
                left = mid + 1;  // move right to find later occurrence
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return last;
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 9};
        int target = 3;

        int[] result = searchRange(arr, target);

        System.out.println("Input Array:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nTarget: " + target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}

//Time Complexity:	O(log N)
//Space Complexity:	O(1)

