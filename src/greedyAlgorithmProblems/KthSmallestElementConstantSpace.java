package greedyAlgorithmProblems;

//https://www.geeksforgeeks.org/dsa/kth-smallest-element-in-the-array-using-constant-space-when-array-cant-be-modified/

public class KthSmallestElementConstantSpace {
    public int kthSmallest(int[] arr, int k) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = countLessOrEqual(arr, mid);

            if (count < k) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    private int countLessOrEqual(int[] arr, int target) {
        int count = 0;

        for (int num : arr) {
            if (num <= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        KthSmallestElementConstantSpace kthElement = new KthSmallestElementConstantSpace();

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = kthElement.kthSmallest(arr, k);
        System.out.println("Minimum pages = " + result);
    }
}

//Time Complexity: O(n log(maxValue - minValue))
// Space Complexity: O(1)
