package recursionAndBacktracking;
//https://leetcode.com/problems/permutations-ii/submissions/1922577957/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTwo {

    static class Solution {

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> results = new ArrayList<>();
            Arrays.sort(nums); // important for duplicate handling
            boolean[] used = new boolean[nums.length];
            backtrack(results, nums, new ArrayList<>(), used);
            return results;
        }

        private void backtrack(List<List<Integer>> results, int[] nums,
                               List<Integer> temp, boolean[] used) {

            if (temp.size() == nums.length) {
                results.add(new ArrayList<>(temp));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                // skip duplicates
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }

                used[i] = true;
                temp.add(nums[i]);
                backtrack(results, nums, temp, used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1, 1, 2}; // sample input

        List<List<Integer>> result = s.permuteUnique(nums);

        System.out.println("Unique permutations: ");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}

//Time Complexity: O(U * n)
//Space Complexity: O(U * n)

