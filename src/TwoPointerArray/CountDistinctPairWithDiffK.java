package TwoPointerArray;
//https://www.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1

import java.util.HashMap;

public class CountDistinctPairWithDiffK {

    static class Solution {
        public int TotalPairs(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int count = 0;
            if (k == 0) {
                for (int key : map.keySet()) {
                    if (map.get(key) > 1) {
                        count++;
                    }
                }
            } else {
                for (int key : map.keySet()) {
                    if (map.containsKey(key + k)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 5, 4, 1, 2};
        int k = 2;
        System.out.println(s.TotalPairs(nums, k));
    }
}

//Time Complexity O(n)
//Space Complexity O(n)

