package TwoPointerArray;
//https://www.geeksforgeeks.org/problems/key-pair5616/1

import java.util.Arrays;

public class TwoSumTwoPointer {

    static class Solution {
        boolean twoSum(int arr[], int target) {

            Arrays.sort(arr);   // sort first

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target)
                    return true;
                else if (sum < target)
                    left++;
                else
                    right--;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {4, 1, 5, 2, 7};
        int target = 6;

        boolean result = s.twoSum(arr, target);

        System.out.println("Exists: " + result);
    }
}

//Time Complexity O(n log n)
//Space Complexity O(log n)

