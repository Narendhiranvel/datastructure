package sorting;

//Not In place Sorting
//Stable Sorting

public class MergeSortRecursion {

    private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int middle = left + (right - left) / 2;

        mergeSort(arr, left, middle);

        mergeSort(arr, middle + 1, right);

        merge(arr, left, middle, right);
    }

    // Printing the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};

        System.out.println("Before Sorting");
        printArray(arr);

        int left = 0;
        int right = arr.length - 1;

        mergeSort(arr, left, right);

        System.out.println("After Sorting");
        printArray(arr);
    }
}

// Time Complexity: O(N log N)
// Space Complexity: O(N)
