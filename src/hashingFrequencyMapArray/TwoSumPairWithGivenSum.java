package hashingFrequencyMapArray;

//https://www.geeksforgeeks.org/problems/key-pair5616/1

import java.util.HashSet;

public class TwoSumPairWithGivenSum {

    static class Solution {

        boolean twoSum(int[] arr, int target) {

            HashSet<Integer> set = new HashSet<>();

            for (int num : arr) {

                int complement = target - num;

                if (set.contains(complement)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] arr1 = {1, 4, 45, 6, 10, 8};
        int target1 = 16;
        System.out.println(s.twoSum(arr1, target1)); // true

        int[] arr2 = {1, 2, 4, 3, 6};
        int target2 = 11;
        System.out.println(s.twoSum(arr2, target2)); // false

        int[] arr3 = {2, 7, 11, 15};
        int target3 = 9;
        System.out.println(s.twoSum(arr3, target3)); // true
    }
}

//Time Complexity O(n)
//Space Complexity O(n)
