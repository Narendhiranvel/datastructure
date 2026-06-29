package Array;

//https://leetcode.com/problems/majority-element-ii/

import java.util.*;

public class MajorityElementBruteForce {

    static class Solution {
        public List<Integer> majorityElement(int[] nums) {

            int n = nums.length;
            int majorityElement = n / 3;

            List<Integer> maximumElements = new ArrayList<>();
            Map<Integer, Integer> elementFrequencyMap = new HashMap<>();

            for (int i = 0; i < n; i++) {

                int number = nums[i];

                elementFrequencyMap.put(
                        number,
                        elementFrequencyMap.getOrDefault(number, 0) + 1
                );

                if (elementFrequencyMap.get(number) > majorityElement
                        && !maximumElements.contains(number)) {

                    maximumElements.add(number);
                }
            }
            return maximumElements;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums1 = {3, 2, 3};
        System.out.println(s.majorityElement(nums1)); // [3]

        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(s.majorityElement(nums2)); // [1, 2]

        int[] nums3 = {1};
        System.out.println(s.majorityElement(nums3)); // [1]
    }
}

// Time Complexity: O(n)
//Space Complexity : O(n)
