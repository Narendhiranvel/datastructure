package slidingWindow;

//http://geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1

public class MinimumSwapsAndKTogether {

    static class Solution {

        // Function to find minimum swaps required
        int minSwap(int[] arr, int k) {
            int windowLen = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= k) {
                    windowLen++;
                }
            }

            int maxCount = 0;
            int count = 0;

            for (int i = 0; i < windowLen; i++) {
                if (arr[i] <= k) {
                    count++;
                }
            }
            maxCount = count;

            for (int i = windowLen; i < arr.length; i++) {

                if (arr[i] <= k) {
                    count++;
                }
                if (arr[i - windowLen] <= k) {
                    count--;
                }
                maxCount = Math.max(maxCount, count);
            }
            return windowLen - maxCount;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {2, 1, 5, 6, 3};
        int k = 3; // elements <= 3 should be together

        int result = s.minSwap(arr, k);
        System.out.println("Minimum swaps required = " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity : O(1)
