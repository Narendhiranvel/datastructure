package sorting;

//Input: arr=[5,9,3,1,2,8,4,7,6]
//Output: [1,2,3,4,5,6,7,8,9]

public class MergeSort {

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }


        // Merge the temp arrays back into arr[left..right]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;                                                               // length = 9
        for (int size = 1; size < n; size = 2 * size) {                                   // Size = 1, 2, 4, 8
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * size) {           // leftStart = [0,2,4,6],[0,4],[0],[0]

                int mid = Math.min(leftStart + size - 1, n - 1);                          // mid = [0,2,4,6],[1,5],[3],[7]
                int rightEnd = Math.min(leftStart + 2 * size - 1, n - 1);                 // rightEnd = [1,3,5,7],[3,7],[7],[8]

                merge(arr, leftStart, mid, rightEnd);
            }
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
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};

        System.out.print("Before Sorting: ");
        printArray(arr);

        mergeSort(arr);

        System.out.print("After Sorting:  ");
        printArray(arr);
    }
}

// Time Complexity: O(N log N)
// Space Complexity: O(N)
