package Array;

//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArrayOP {

    static class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> duplicates = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;

                if (nums[index] < 0) {
                    duplicates.add(Math.abs(nums[i]));
                } else {
                    nums[index] = -nums[index];
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
//Space Complexity : O(1)
