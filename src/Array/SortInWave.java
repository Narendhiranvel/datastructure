package Array;

import java.util.Arrays;

public class SortInWave {

    static class Solution {

        public void sortInWave(int arr[]) {
            int n = arr.length - 1;
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80}; // sample input

        System.out.println("Original array: " + Arrays.toString(arr));

        s.sortInWave(arr);

        System.out.println("Array in wave form: " + Arrays.toString(arr));
    }
}

