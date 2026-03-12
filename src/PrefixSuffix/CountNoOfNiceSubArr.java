package PrefixSuffix;
//https://leetcode.com/problems/count-number-of-nice-subarrays/description/

import java.util.HashMap;
import java.util.Map;

public class CountNoOfNiceSubArr {

    static class Solution {
        public int numberOfSubarrays(int[] nums, int k) {
            int prefixOdd = 0;
            int count = 0;

            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            for (int num : nums) {
                if (num % 2 == 1) {
                    prefixOdd++;
                }

                if (map.containsKey(prefixOdd - k)) {
                    count += map.get(prefixOdd - k);
                }

                map.put(prefixOdd, map.getOrDefault(prefixOdd, 0) + 1);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int result = s.numberOfSubarrays(nums, k);
        System.out.println("Number of nice subarrays: " + result);
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
