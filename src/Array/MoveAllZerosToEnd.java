package Array;

//Move all zeros to the end
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int arrLastPosition = arr.length - 1;
        for (int i = 0; i <= arrLastPosition; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[arrLastPosition];
                arr[arrLastPosition] = temp;
                arrLastPosition--;
            }
        }
        System.out.println("Array " + Arrays.toString(arr));
    }
}

// Time Complexity O(n)
// Space complexity O(1)