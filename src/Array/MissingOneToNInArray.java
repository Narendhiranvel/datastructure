package Array;
//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

public class MissingOneToNInArray {

    static class Solution {
        int missingNum(int arr[]) {
            int n = arr.length;
            long expectedSum = (long) (n + 1) * (n + 2) / 2; // sum of 1..(n+1)
            long actualSum = 0;

            for (int num : arr) {
                actualSum += num;
            }

            return (int) (expectedSum - actualSum);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 2, 4, 5, 6}; // sample input (missing 3)
        int missingNumber = s.missingNum(arr);

        System.out.println("Missing number is: " + missingNumber);
    }
}

//Time Complexity: O(n)
//Space Complexity : O(1)

