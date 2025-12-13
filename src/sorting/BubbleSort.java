package sorting;

//In place Sorting
//Stable Sorting
//Adaptive Sorting
//Input: arr=[5,9,3,1,2,8,4,7,6]
//Output: [1,2,3,4,5,6,7,8,9]

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        bubbleSorting(arr);
    }

    private static void bubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
        }
        for (int num : arr) {
            System.out.printf(num + " ");
        }
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)
