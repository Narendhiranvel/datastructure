package greedyAlgorithmProblems;

//https://www.geeksforgeeks.org/dsa/painters-partition-problem/

public class BS_I_M_PainterPartition {

    static class Solution {
        public int paintPartitions(int[] arr, int k) {

            int n = arr.length;
            if (k > n) return -1;

            int minTime = 0;
            int maxTime = 0;

            for (int time : arr) {
                minTime = Math.max(minTime, time);
                maxTime += time;
            }

            int ans = -1;

            while (minTime <= maxTime) {
                int mid = minTime + (maxTime - minTime) / 2;

                if (canPaint(arr, k, mid)) {
                    ans = mid;
                    maxTime = mid - 1;
                } else {
                    minTime = mid + 1;
                }
            }
            return ans;
        }

        private boolean canPaint(int[] arr, int k, int maxTime) {
            int painters = 1;
            int timeSum = 0;

            for (int time : arr) {
                if (timeSum + time <= maxTime) {
                    timeSum += time;
                } else {
                    painters++;
                    timeSum = time;
                }
            }
            return painters <= k;
        }
    }


    public static void main(String[] args) {
        BS_I_M_PainterPartition.Solution s = new BS_I_M_PainterPartition.Solution();

        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;

        int result = s.paintPartitions(arr, k);
        System.out.println("Minimum pages = " + result);
    }
}
