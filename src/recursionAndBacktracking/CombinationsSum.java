package recursionAndBacktracking;
//https://leetcode.com/problems/combination-sum/description/

import java.util.ArrayList;
import java.util.List;

public class CombinationsSum {
    static class Solution {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(result, new ArrayList<>(), candidates, target, 0, 0);
            return result;
        }

        private void backtrack(List<List<Integer>> result,
                               List<Integer> temp,
                               int[] candidates,
                               int target,
                               int start,
                               int total) {

            if (total == target) {
                result.add(new ArrayList<>(temp));
                return;
            }
            if (total > target) {
                return;
            }

            for (int i = start; i < candidates.length; i++) {

                total += candidates[i];
                temp.add(candidates[i]);

                // allow reuse of same element → pass i (not i+1)
                backtrack(result, temp, candidates, target, i, total);

                // backtrack
                temp.remove(temp.size() - 1);
                total -= candidates[i];
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = s.combinationSum(candidates, target);
        System.out.println(result);
    }
}

// Time Complexity: O(N^(target/min))
// Space Complexity: O(target/m)


