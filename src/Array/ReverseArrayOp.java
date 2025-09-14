package Array;

import java.util.Arrays;

//Reverse an array
//Input: [1, 2, 3, 4, 5]
//Output: [5, 4, 3, 2, 1]

public class ReverseArrayOp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time Complexity O(n)
// Space complexity O(1)