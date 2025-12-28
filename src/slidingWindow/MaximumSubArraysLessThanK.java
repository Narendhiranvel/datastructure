package slidingWindow;

//Input :  arr[] = [1, 2, 3, 4], k = 8.
//Output : 2
//Explanation: Following are the sum of subarray of size 1 to 4.

//Sum of subarrays of size 1: 1, 2, 3, 4.
//Sum of subarrays of size 2: 3, 5, 7.
//Sum of subarrays of size 3: 6, 9.
//Sum of subarrays of size 4: 10.
//So, maximum subarray size such that all subarrays of that size have the sum of elements less than 8 is 2.

//Input:  arr[] = [1, 2, 10, 4], k = 8.
//Output : -1
//Explanation: There is an array element (10) with value greater than k, so subarray sum cannot be less than k.

//Input :  arr[] = [1, 2, 10, 4], k = 14
//Output : 2

public class MaximumSubArraysLessThanK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 8;

        System.out.println(findMaximumSubArrayLessThanK(arr, k));
    }

    public static int findMaximumSubArrayLessThanK(int[] arr, int k) {
        int subArrSize = 1;
        int count = 0;
        int n = arr.length;

        // If any element itself is greater than k, no valid subarray
        for (int x : arr) {
            if (x > k) {
                return -1;
            }
        }

        while (subArrSize <= n) {
            int winSum = 0;
            int winStart = 0;
            boolean valid = true;

            // first window sum
            for (int i = 0; i < subArrSize; i++) {
                winSum += arr[i];
            }

            if (winSum > k) {
                valid = false;
            }

            // slide the window
            for (int winEnd = subArrSize; winEnd < n && valid; winEnd++) {
                winSum += arr[winEnd] - arr[winStart];
                winStart++;
                if (winSum > k) {
                    valid = false;
                }
            }

            if (!valid) {
                break; // larger sizes will also fail
            }

            count = subArrSize; // update max valid size
            subArrSize++;
        }

        return count;
    }
}


// Time Complexity - O(n²)
// Space complexity O(1)
