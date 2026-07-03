package Array;

import java.util.Arrays;

public class RearrangeSortedArrayAlternatively {

    static class Solution {
        public void rearrange(int arr[]) {

            int max = Integer.MIN_VALUE;

            for (int num : arr) {
                max = Math.max(num, max);
            }

            int base = max + 1;

            int n = arr.length;
            int left = 0;
            int right = n - 1;

            for (int i = 0; i < n; i++) {

                if (i % 2 == 0) {
                    int val = arr[right] % base;
                    arr[i] += val * base;
                    right--;
                } else {
                    int val = arr[left] % base;
                    arr[i] += val * base;
                    left++;
                }
            }
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] / base;
            }
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        s.rearrange(arr1);
        System.out.println(Arrays.toString(arr1)); // [6, 1, 5, 2, 4, 3]

        int[] arr2 = {10, 20, 30, 40, 50};
        s.rearrange(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)