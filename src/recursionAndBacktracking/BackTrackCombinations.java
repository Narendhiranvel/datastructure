package recursionAndBacktracking;
//https://leetcode.com/problems/combinations/description/

import java.util.ArrayList;
import java.util.List;

public class BackTrackCombinations {

    static class Solution {

        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();
            backtrackCombinations(result, new ArrayList<>(), 1, n, k);
            return result;
        }

        private void backtrackCombinations(List<List<Integer>> result,
                                           List<Integer> temp,
                                           int start, int n, int k) {

            if (temp.size() == k) {
                result.add(new ArrayList<>(temp));
                return;
            }

            for (int i = start; i <= n; i++) {
                temp.add(i);
                backtrackCombinations(result, temp, i + 1, n, k);
                temp.remove(temp.size() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 4;
        int k = 2;

        List<List<Integer>> result = s.combine(n, k);

        System.out.println(result);
    }
}

// Time Complexity: O(C(n,k) * k)
// Space Complexity: O(C(n,k) * k)

