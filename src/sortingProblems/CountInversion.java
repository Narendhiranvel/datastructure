package sortingProblems;

public class CountInversion {

    static class Solution {

        static int inversionCount(int arr[]) {
            int left = 0;
            int right = arr.length - 1;
            return mergeSort(arr, left, right);
        }

        private static int mergeSort(int[] arr, int left, int right) {
            if (left >= right) return 0;

            int middle = left + (right - left) / 2;
            int count = 0;

            count += mergeSort(arr, left, middle);
            count += mergeSort(arr, middle + 1, right);
            count += merge(arr, left, middle, right);

            return count;
        }

        private static int merge(int[] arr, int left, int middle, int right) {
            int n1 = middle - left + 1;
            int n2 = right - middle;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for (int i = 0; i < n1; i++) {
                leftArray[i] = arr[left + i];
            }
            for (int i = 0; i < n2; i++) {
                rightArray[i] = arr[middle + 1 + i];
            }

            int i = 0, j = 0, k = left;
            int count = 0;

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k++] = leftArray[i++];
                } else {
                    arr[k++] = rightArray[j++];
                    count += (n1 - i); // key inversion logic
                }
            }

            while (i < n1) arr[k++] = leftArray[i++];
            while (j < n2) arr[k++] = rightArray[j++];

            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5}; // sample input

        int result = Solution.inversionCount(arr);
        System.out.println("Inversion Count = " + result);
    }
}

// Time Complexity: O(n log n)
// Space Complexity: O(n)