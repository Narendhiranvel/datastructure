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

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        int firstStart = 0;
        int firstReverse = k - 1;
        while (firstStart < firstReverse) {
            int temp = arr[firstStart];
            arr[firstStart] = arr[firstReverse];
            arr[firstReverse] = temp;

            firstStart++;
            firstReverse--;
        }
        System.out.println(Arrays.toString(arr));

        int secondStart = k;
        int secondReverse = arr.length - 1;
        while (secondStart < secondReverse) {
            int temp = arr[secondStart];
            arr[secondStart] = arr[secondReverse];
            arr[secondReverse] = temp;

            secondStart++;
            secondReverse--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Time Complexity: O(n) (3 reversals, each O(n))
//Space Complexity: O(1) (in-place swaps only)
