package heap;

import java.util.PriorityQueue;

public class KthSmallestElementMatrixBruteForce {

    static class Solution {
        public int kthSmallest(int[][] matrix, int k) {

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    minHeap.add(matrix[i][j]);
                }
            }

            int i = 1;
            while (i < k) {
                minHeap.poll();
                i++;
            }

            return minHeap.poll();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

        int k = 8;

        int result = s.kthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}

//Time Complexity = O(n² log n)
//Time Complexity = O(n²)

