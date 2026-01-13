package Array;
//https://www.geeksforgeeks.org/dsa/rearrange-array-arrj-becomes-arri-j/

import java.util.Arrays;

public class InverseMappingOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after inverse mapping " + Arrays.toString(inverseArrayIndex(arr)));
    }

    private static int[] inverseArrayIndex(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int indexValue = arr[i];
            arr2[indexValue] = i;
        }
        return arr2;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
