package slidingWindow;

public class MaxAvgSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 4;

        double maxAverage = findMaxAverage(nums, k);
        System.out.println("Maximum Average = " + maxAverage);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int windowStart = 0;
        double maxAverage = Double.NEGATIVE_INFINITY;
        double windowTotal = 0;

        // Calculate initial window sum
        for (int i = 0; i < k; i++) {
            windowTotal += nums[i];
        }

        // Initial average
        double windowAvg = windowTotal / k;
        maxAverage = windowAvg;

        // Slide the window
        for (int winEnd = k; winEnd < nums.length; winEnd++) {
            windowTotal += nums[winEnd] - nums[windowStart];
            windowStart++;

            windowAvg = windowTotal / k;
            if (windowAvg > maxAverage) {
                maxAverage = windowAvg;
            }
        }
        return maxAverage;
    }
}

//Complexity
//Time: O(n)
//Space: O(1)
