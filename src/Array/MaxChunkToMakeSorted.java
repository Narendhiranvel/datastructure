package Array;
//https://leetcode.com/problems/max-chunks-to-make-sorted/

import java.util.Arrays;

public class MaxChunkToMakeSorted {

    static class Solution {
        public int maxChunksToSorted(int[] arr) {
            int maxSoFar = 0;
            int chunks = 0;

            for (int i = 0; i < arr.length; i++) {
                maxSoFar = Math.max(maxSoFar, arr[i]);
                if (maxSoFar == i) {
                    chunks++;
                }
            }
            return chunks;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 0, 2, 3, 4}; // sample input
        System.out.println("Array: " + Arrays.toString(arr));

        int result = s.maxChunksToSorted(arr);
        System.out.println("Maximum chunks to make sorted = " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity : O(1)

