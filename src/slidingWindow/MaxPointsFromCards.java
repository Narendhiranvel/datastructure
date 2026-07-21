package slidingWindow;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaxPointsFromCards {

    static class Solution {
        public int maxScore(int[] cardPoints, int k) {

            int totalPoints = 0;

            for (int points : cardPoints) {
                totalPoints += points;
            }

            if (k == cardPoints.length) {
                return totalPoints;
            }

            int windowSize = cardPoints.length - k;

            int windowSum = 0;

            for (int i = 0; i < windowSize; i++) {
                windowSum += cardPoints[i];
            }

            int minWindowSum = windowSum;

            int left = 0;

            for (int right = windowSize; right < cardPoints.length; right++) {

                // Remove left element and add right element
                windowSum = windowSum - cardPoints[left] + cardPoints[right];

                left++;

                // Track the minimum window sum
                minWindowSum = Math.min(minWindowSum, windowSum);
            }

            return totalPoints - minWindowSum;
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
