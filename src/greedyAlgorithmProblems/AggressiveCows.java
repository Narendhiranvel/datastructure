package greedyAlgorithmProblems;

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
            int n = stalls.length;
            Arrays.sort(stalls);

            int low = 1;
            int high = stalls[n - 1] - stalls[0];
            int answer = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (canPlaceCows(stalls, k, mid)) {
                    answer = mid;
                    low = mid + 1; // try for larger distance
                } else {
                    high = mid - 1;
                }
            }

            return answer;
        }

        private boolean canPlaceCows(int[] stalls, int k, int distance) {
            int count = 1;
            int lastPlaced = stalls[0];

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPlaced >= distance) {
                    count++;
                    lastPlaced = stalls[i];
                    if (count == k) return true;
                }
            }

            return false;
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
