package hashingFrequencyMapArray;

//https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1

import java.util.HashMap;

public class PairWithGivenSumInSortedArray {

    static class Solution {

        int countPairs(int arr[], int target) {

            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : arr) {

                int complement = target - num;

                if (map.containsKey(complement)) {
                    count += map.get(complement);
                }

                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] arr1 = {1, 1, 1, 1};
        int target1 = 2;
        System.out.println(s.countPairs(arr1, target1)); // 6

        int[] arr2 = {1, 5, 7, 1};
        int target2 = 6;
        System.out.println(s.countPairs(arr2, target2)); // 2

        int[] arr3 = {1, 2, 3, 4, 5};
        int target3 = 5;
        System.out.println(s.countPairs(arr3, target3)); // 2

        int[] arr4 = {2, 2, 2, 2};
        int target4 = 4;
        System.out.println(s.countPairs(arr4, target4)); // 6
    }
}

//Time Complexity O(n)
//Space Complexity O(n)
