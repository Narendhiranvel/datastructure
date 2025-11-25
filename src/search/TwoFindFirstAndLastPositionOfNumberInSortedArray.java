package search;

public class TwoFindFirstAndLastPositionOfNumberInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int left = -1;
        int right = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            while (mid >= 0 && nums[mid] == target) {
                left = mid;
                if (mid - 1 < 0 || nums[mid - 1] != target) {
                    end = mid - 1;
                    break;
                }
                mid--;
            }
            if (mid >= 0 && nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            while (mid < nums.length && nums[mid] == target) {
                right = mid;
                if (mid + 1 >= nums.length || nums[mid + 1] != target) {
                    start = mid + 1;
                    break;
                }
                mid++;
            }
            if (mid < nums.length && nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{left, right};
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfNumberInSortedArray s = new FindFirstAndLastPositionOfNumberInSortedArray();

        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        int[] res1 = s.searchRange(nums1, target1);
        System.out.println(res1[0] + " " + res1[1]);
    }
}

//Time Complexity:	O(log N + k)
//Space Complexity:	O(1)

