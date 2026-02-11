package recursionAndBacktracking;
//https://leetcode.com/problems/combination-sum-iii/
import java.util.ArrayList;
import java.util.List;

public class BackTrackCombinationsThree {

    static class Solution {

        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> result = new ArrayList<>();
            backTrackCombinations3(result, new ArrayList<>(), 1, 9, k, n);
            return result;
        }

        private void backTrackCombinations3(List<List<Integer>> result, List<Integer> temp,
                                            int start, int maxTraverse, int k, int n) {

            // If current combination has k numbers
            if (temp.size() == k) {
                int sum = 0;
                for (int num : temp) sum += num;

                if (sum == n) {
                    result.add(new ArrayList<>(temp));
                }
                return;
            }

            for (int i = start; i <= maxTraverse; i++) {
                temp.add(i);
                backTrackCombinations3(result, temp, i + 1, maxTraverse, k, n);
                temp.remove(temp.size() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int k = 3;
        int n = 7;

        List<List<Integer>> result = s.combinationSum3(k, n);

        System.out.println(result);
    }
}

// Time Complexity: O(C(n,k) * k)
// Space Complexity: O(C(n,k) * k)
