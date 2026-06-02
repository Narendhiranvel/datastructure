package Array;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInArray {

    static class Solution {
        public List<Integer> findDuplicates(int[] nums) {

            Map<Integer, Integer> count = new HashMap<>();
            List<Integer> duplicates = new ArrayList<>();

            for (int num : nums) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() > 1) {
                    duplicates.add(entry.getKey());
                }
            }
            return duplicates;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = s.findDuplicates(nums);

        System.out.println("Duplicates: " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity : O(n)