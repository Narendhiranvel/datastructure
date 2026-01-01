package sortingProblems;

//Given an array arr, write a program segregating even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.
//        Note:- You don't have to return the array, you have to modify it in-place.
//Example:
//Input: arr[] = [12, 34, 45, 9, 8, 90, 3]
//Output: [8, 12, 34, 90, 3, 9, 45]
//Explanation: Even numbers are 12, 34, 8 and 90. Rest are odd numbers.

import java.util.Arrays;

public class SegregateEvenAndOdd {

    static class Solution {

        void segregateEvenOdd(int arr[]) {
            int left = 0;
            int right = arr.length - 1;

            sortEvenAndOdd(arr, left, right);

            int i = 0;
            while (i < arr.length && arr[i] % 2 == 0) {
                i++;
            }

            // Sort even part
            Arrays.sort(arr, 0, i);
            // Sort odd part
            Arrays.sort(arr, i, arr.length);
        }

        private static void sortEvenAndOdd(int[] arr, int left, int right) {
            while (left < right) {
                if (arr[left] % 2 == 0) {
                    left++;
                } else if (arr[right] % 2 != 0) {
                    right--;
                } else {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
            }
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {12, 34, 45, 9, 8, 90, 3}; // sample input

        s.segregateEvenOdd(arr);

        System.out.println(Arrays.toString(arr));
    }
}

//Time Complexity: O(log n) on average
// Space Complexity: O(1)