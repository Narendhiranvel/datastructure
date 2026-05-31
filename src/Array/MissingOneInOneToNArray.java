package Array;
//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

public class MissingOneInOneToNArray {
    static class Solution {
        int missingNum(int arr[]) {

            int n = arr.length;

            int maxNo = Integer.MIN_VALUE;
            int arrTotal = 0;

            // sum + max
            for (int num : arr) {
                if (num > maxNo) {
                    maxNo = num;
                }
                arrTotal += num;
            }

            int minNo = 1;

            // expected sum from 1 to maxNo
            int expectedTotal = 0;
            for (int i = minNo; i <= maxNo; i++) {
                expectedTotal += i;
            }
            // if missing is after max (edge case like [1,2,3])
            if (arrTotal == expectedTotal) {
                return maxNo + 1;
            }

            return expectedTotal - arrTotal;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1, 2, 4, 5};
        System.out.println(s.missingNum(arr1)); // 3

        int[] arr2 = {2, 3, 1, 5};
        System.out.println(s.missingNum(arr2)); // 4

        int[] arr3 = {1};
        System.out.println(s.missingNum(arr3)); // 2
    }
}

//Time Complexity: O(n)
//Space Complexity : O(1)
