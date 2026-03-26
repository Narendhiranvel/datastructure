package searchingProblems;

//https://leetcode.com/problems/find-peak-element/submissions/1957514449/
public class C_M_FindPeekElementInArray {

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak is on the left (including mid)
                end = mid;
            } else {
                // Peak is on the right
                start = mid + 1;
            }
        }

        return start;  // start == end (peak index)
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        int peakIndex = findPeakElement(nums);

        System.out.println("Input array:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Peak found at index: " + peakIndex);
        System.out.println("Peak value: " + nums[peakIndex]);
    }
}

//Time Complexity: O(log n)
//Time Complexity: O(1)
