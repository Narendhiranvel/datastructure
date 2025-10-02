package slidingWindow;

// Sliging Window Fixed
//Maximum sum subarray of size k
//Input: [2,1,5,1,3,2], k=3
//Output: 9 ([5,1,3])

public class MaxSubArrayOp {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxWinSum = Integer.MIN_VALUE;
        int winSum = 0;
        int winStart = 0;
        int startIndex = 0;

        for (int i = 0; i < k; i++) {
            winSum += arr[i];
        }
        maxWinSum = winSum;

        for (int winEnd = k; winEnd < arr.length; winEnd++) {
            winSum += arr[winEnd] - arr[winStart];
            winStart++;

            if (winSum > maxWinSum) {
                maxWinSum = winSum;
                startIndex = winStart;
            }
        }
        System.out.println("Max Sum = " + maxWinSum);
        System.out.print("Subarray = ");
        for (int j = startIndex; j < startIndex + k; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

// Time Complexity - O(n)
// Space complexity O(1)
