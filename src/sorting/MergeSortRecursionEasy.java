package sorting;

//Not In place Sorting
//Stable Sorting
//Non Adaptive

import java.util.Arrays;

public class MergeSortRecursionEasy {

    private static int[] merge(int[] left, int[] right) {
        int[] resultArr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                resultArr[k++] = left[i++];
            } else {
                resultArr[k++] = right[j++];
            }
        }
        while (i < left.length) resultArr[k++] = left[i++];
        while (j < right.length) resultArr[k++] = right[j++];

        return resultArr;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, middle);
        int[] rightArr = Arrays.copyOfRange(arr, middle, arr.length);

        int[] sortedLeft = mergeSort(leftArr);
        int[] sortedRight = mergeSort(rightArr);

        return merge(sortedLeft, sortedRight);
    }

    // Printing the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 7};
        System.out.println("Before Sorting ");
        printArray(arr);

        System.out.println("After Merge Sort ");
        arr = mergeSort(arr);
        printArray(arr);
    }
}

// Time Complexity: O(N log N)
// Space Complexity: O(N)
