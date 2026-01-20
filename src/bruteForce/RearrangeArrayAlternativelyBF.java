package bruteForce;
//https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

import java.util.Arrays;

public class RearrangeArrayAlternativelyBF {

    static class Solution {
        public void rearrange(int arr[]) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                int selectedIndex = i;

                if (i % 2 == 0) {
                    // even index → place maximum
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] > arr[selectedIndex]) {
                            selectedIndex = j;
                        }
                    }
                } else {
                    // odd index → place minimum
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[selectedIndex]) {
                            selectedIndex = j;
                        }
                    }
                }

                swap(arr, i, selectedIndex);
            }
        }

        private void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 2, 3, 4, 5, 6};
        s.rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}

// Time Complexity: O(n²)
// Space Complexity: O(1)

