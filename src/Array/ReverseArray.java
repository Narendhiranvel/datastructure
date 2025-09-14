package Array;
import java.util.Arrays;

//Reverse an array
//Input: [1, 2, 3, 4, 5]
//Output: [5, 4, 3, 2, 1]

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == arr.length - 1 - i) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time Complexity O(n^2)
// Space complexity O(1)