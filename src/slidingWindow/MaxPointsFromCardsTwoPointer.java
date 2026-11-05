package slidingWindow;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaxPointsFromCardsTwoPointer {

    static class Solution {

        public int maxScore(int[] cardPoints, int k) {

            int n = cardPoints.length;
            int sum = 0;

            // Calculate sum of first k cards from left
            for (int i = 0; i < k; i++) {
                sum += cardPoints[i];
            }

            int maxScore = sum;

            // Remove one card from left and add one from right
            for (int i = 1; i <= k; i++) {

                sum -= cardPoints[k - i];
                sum += cardPoints[n - i];

                maxScore = Math.max(maxScore, sum);
            }

            return maxScore;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int maxPoints = solution.maxScore(cardPoints, k);

        System.out.println("Maximum points: " + maxPoints);
    }
}

// Time Complexity: O(k)
// Space Complexity: O(1)
