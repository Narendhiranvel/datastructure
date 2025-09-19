package Array;

//Rotate array (by k positions)
//Input: arr = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

import java.util.Arrays;

public class RotateArrayKPositions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % arr.length;

        int start = 0;
        int end = arr.length - 1;

        int firstKStart = 0;
        int firstKReverse = k - 1;

        int secondKStart = k;
        int secondKReverse = arr.length - 1;

        System.out.println("Actual Array " + Arrays.toString(arr));

        rotateArrayKPosition(arr, start, end);

        System.out.println("Reversed Array " + Arrays.toString(arr));

        rotateArrayKPosition(arr, firstKStart, firstKReverse);

        System.out.println("First K reversed " + Arrays.toString(arr));

        rotateArrayKPosition(arr, secondKStart, secondKReverse);

        System.out.println("Second K reversed " + Arrays.toString(arr));

    }

    private static void rotateArrayKPosition(int[] arr, int first, int last) {

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}

//Time Complexity: O(n) (3 reversals, each O(n))
//Space Complexity: O(1) (in-place swaps only)
