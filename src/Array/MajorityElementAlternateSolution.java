package Array;
//https://leetcode.com/problems/majority-element-ii/description/
import java.util.*;

public class MajorityElementAlternateSolution {

    static class Solution {
        public List<Integer> majorityElement(int[] nums) {
            int n = nums.length;
            int limit = n / 3;

            Map<Integer, Integer> elementsCount = new HashMap<>();
            List<Integer> majorElement = new ArrayList<>();

            for (int num : nums) {
                elementsCount.put(num, elementsCount.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : elementsCount.entrySet()) {
                if (entry.getValue() > limit) {
                    majorElement.add(entry.getKey());
                }
            }

            return majorElement;
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

//Time Complexity: O(n)
//Space Complexity : O(1)
