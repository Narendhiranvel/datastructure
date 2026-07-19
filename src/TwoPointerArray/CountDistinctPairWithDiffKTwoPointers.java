package TwoPointerArray;

//https://www.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1

import java.util.Arrays;

public class CountDistinctPairWithDiffKTwoPointers {

    static class Solution {

        public int countPairs(int[] arr, int k) {

            Arrays.sort(arr);

            int left = 0;
            int right = 1;
            int count = 0;
            int n = arr.length;

            while (right < n) {

                if (left == right) {
                    right++;
                    continue;
                }

                int diff = arr[right] - arr[left];

                if (diff == k) {
                    count++;

                    int leftValue = arr[left];
                    int rightValue = arr[right];

                    while (left < n && arr[left] == leftValue) {
                        left++;
                    }

                    while (right < n && arr[right] == rightValue) {
                        right++;
                    }
                } else if (diff < k) {
                    right++;
                } else {
                    left++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] arr1 = {1, 5, 3, 4, 2};
        int k1 = 2;
        System.out.println(s.countPairs(arr1, k1)); // 3

        int[] arr2 = {8, 12, 16, 4, 0, 20};
        int k2 = 4;
        System.out.println(s.countPairs(arr2, k2)); // 5

        int[] arr3 = {1, 1, 1, 2, 2};
        int k3 = 1;
        System.out.println(s.countPairs(arr3, k3)); // 1
    }
}

//Time Complexity O(n log n + n) = O(n log n)
//Space Complexity O(log n)