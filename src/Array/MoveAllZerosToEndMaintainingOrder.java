package Array;

//Move all zeros to the end
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]

import java.util.Arrays;

public class MoveAllZerosToEndMaintainingOrder {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println("Array " + Arrays.toString(arr));
    }
}

// Time Complexity O(n)
// Space complexity O(1)