package PrefixSuffix;
//https://leetcode.com/problems/binary-subarrays-with-sum/description/

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraysWithSum {

    static class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int prefixSum = 0;
            int count = 0;

            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            for (int num : nums) {
                prefixSum += num;

                if (map.containsKey(prefixSum - goal)) {
                    count += map.get(prefixSum - goal);
                }

                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = s.numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum " + goal + " = " + result);
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
