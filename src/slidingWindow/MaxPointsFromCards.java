package slidingWindow;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaxPointsFromCards {

    static class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int sum = 0;
            int minContinuousBlock = Integer.MAX_VALUE;

            // Total sum of array
            for (int i = 0; i < cardPoints.length; i++) {
                sum += cardPoints[i];
            }
            int block = cardPoints.length - k;  // size of subarray to remove
            int winSum = 0;
            // Initial window
            for (int i = 0; i < block; i++) {
                winSum += cardPoints[i];
            }

            minContinuousBlock = Math.min(minContinuousBlock, winSum);
            int winStart = 0;
            // Sliding window
            for (int winEnd = block; winEnd < cardPoints.length; winEnd++) {
                winSum += cardPoints[winEnd] - cardPoints[winStart];
                winStart++;
                minContinuousBlock = Math.min(minContinuousBlock, winSum);
            }
            return sum - minContinuousBlock;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int result = s.maxScore(cardPoints, k);
        System.out.println("Maximum score: " + result);
    }
}

//Time: O(n)
//Space: O(1)
