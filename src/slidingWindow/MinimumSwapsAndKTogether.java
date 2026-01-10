package slidingWindow;

public class MinimumSwapsAndKTogether {

    static class Solution {

        // Function to find minimum swaps required
        int minSwap(int[] arr, int k) {
            int n = arr.length;
            int count = 0;
            int bad = 0;

            // Count elements <= k
            for (int i = 0; i < n; i++) {
                if (arr[i] <= k) {
                    count++;
                }
            }

            // Count bad elements in first window
            for (int i = 0; i < count; i++) {
                if (arr[i] > k) {
                    bad++;
                }
            }

            int minSwaps = bad;

            // Sliding window
            for (int i = 0, j = count; j < n; i++, j++) {
                if (arr[i] > k) bad--;
                if (arr[j] > k) bad++;

                minSwaps = Math.min(minSwaps, bad);
            }

            return minSwaps;
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
