package searchingProblems;

//A peak element is an element that is strictly greater than its neighbors.
//Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
//You must write an algorithm that runs in O(log n) time.
//
//Example:
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.

public class FindPeekElementInArray {

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
