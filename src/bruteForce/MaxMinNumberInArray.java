package bruteForce;

import java.util.Arrays;

//Problem: Find the largest and smallest element in an array.
//        Input: [3, 1, 7, 4, 9]
//        Output: Max: 9, Min: 1

public class MaxMinNumberInArray {
    public static void main(String[] args) {
        int[] arr = {54, 7, 99, 34, 89, 15, 11, 64, 5, 25};
        System.out.println("Length of array " + arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array (descending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] maxMinArr = {arr[arr.length - 1], arr[0]};
        System.out.println(Arrays.toString(maxMinArr));

    }
}

// Time Complexity O(n^2)
// Space complexity O(1)