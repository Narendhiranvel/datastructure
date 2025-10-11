package sorting;

//Input: arr=[5,9,3,1,2,8,4,7,6]
//Output: [1,2,3,4,5,6,7,8,9]

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        selectionSorting(arr);
    }

    private static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int miniumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[miniumIndex]) {
                    miniumIndex = j;
                }
            }
            if (miniumIndex != i) {
                int temp = arr[i];
                arr[i] = arr[miniumIndex];
                arr[miniumIndex] = temp;
            }
        }
        for (int num : arr) {
            System.out.printf(num + " ");
        }
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)
