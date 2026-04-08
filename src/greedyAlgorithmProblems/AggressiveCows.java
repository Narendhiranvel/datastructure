package greedyAlgorithmProblems;
//https://www.geeksforgeeks.org/problems/aggressive-cows/0

//You are given an array with unique elements of stalls[], which denote the positions of stalls. You are also given an integer k which denotes the number of aggressive cows. The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
//
//        Examples:
//
//        Input: stalls[] = [1, 2, 4, 8, 9], k = 3
//        Output: 3
//        Explanation: The first cow can be placed at stalls[0],
//        the second cow can be placed at stalls[2] and
//        the third cow can be placed at stalls[3].
//        The minimum distance between cows in this case is 3, which is the largest among all possible ways.

import java.util.Arrays;

public class AggressiveCows {

    static class Solution {
        public int aggressiveCows(int[] stalls, int k) {
            if (k <= 1) return 0;

            Arrays.sort(stalls);
            int start = 0;
            int end = stalls[stalls.length - 1] - stalls[start];
            int ans = 0;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (canPlace(stalls, k, mid)) {
                    ans = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }

        private boolean canPlace(int[] stalls, int k, int dist) {
            int cows = 1;
            int lastPlaced = stalls[0];

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPlaced >= dist) {
                    cows++;
                    lastPlaced = stalls[i];
                }
            }
            return cows >= k;
        }
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        int[] stalls = {1, 2, 4, 8, 9}; // sample stalls
        int k = 3; // number of cows

        int maxMinDistance = solver.aggressiveCows(stalls, k);
        System.out.println("Maximum minimum distance = " + maxMinDistance);
    }
}

//Time Complexity: =  O(n log n + n * log D)
//Space Complexity: 0(1)
