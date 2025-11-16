package sorting;

//In place Sorting
//Not Stable Sorting
public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int partition(int[] arr, int left, int right) {
        int i = left - 1;
        int pivot = arr[right];
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void quickSorting(int[] arr, int left, int right) {
        if (left < right) {  // Base condition
            int pivotIndex = partition(arr, left, right);

            quickSorting(arr, left, pivotIndex - 1);   // Left subarray
            quickSorting(arr, pivotIndex + 1, right);  // Right subarray
        }
    }

    // Printing the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 1, 2, 9, 4, 7, 6};
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Before Quick Sort");
        printArray(arr);

        System.out.println("After Quick Sort");
        quickSorting(arr, left, right);
        printArray(arr);
    }
}

// Time Complexity: O(N log N)
// Space Complexity: Best / Average case: O(log N), Worst case: O(N)

