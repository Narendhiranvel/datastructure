package slidingWindow;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaxPointsFromCards {

    static class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length;
            int gap = n - k;
            int totalPoints = 0;

            for (int i = 0; i < n; i++) {
                totalPoints += cardPoints[i];
            }
            int gapTotal = 0;

            for (int i = 0; i < gap; i++) {
                gapTotal += cardPoints[i];
            }

            int maxPoints = totalPoints - gapTotal;
            int left = 0;

            for (int right = gap; right < n; right++) {
                gapTotal += cardPoints[right] - cardPoints[left];
                maxPoints = Math.max(maxPoints, totalPoints - gapTotal);
                left++;
            }

            return maxPoints;
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
