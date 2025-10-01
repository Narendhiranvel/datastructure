package Array;

// Two Pointer
//Remove duplicates from sorted array
//Input: [1,1,2,2,3,4,4,5]
//Output: [1,2,3,4,5]

import java.util.Arrays;

public class RemoveDuplicatesSortedArrayOp {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, i + 1)));
    }
}

// Time complexity - O(n)
// Space complexity - O(1)
// Space complexity - O(n) if we consider Arrays.copyOf
