package sortingProblems;

public class KthSmallestElementQuickSelect {
    // Method to find the kth smallest element
    public int kthSmallest(int[] arr, int k) {
        return quickSorting(arr, 0, arr.length - 1, k - 1);
    }

    // QuickSort helper
    private int quickSorting(int[] arr, int left, int right, int kIndex) {
        if (left <= right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex == kIndex) {
                return arr[pivotIndex];
            } else if (pivotIndex > kIndex) {
                return quickSorting(arr, left, pivotIndex - 1, kIndex);
            } else {
                return quickSorting(arr, pivotIndex + 1, right, kIndex);
            }
        }
        return -1;
    }

    // Partition method for QuickSort
    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    // Main method with sample input
    public static void main(String[] args) {
        KthSmallestElementQuickSelect solver = new KthSmallestElementQuickSelect();

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3; // Find the 3rd smallest element

        int result = solver.kthSmallest(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }
}
