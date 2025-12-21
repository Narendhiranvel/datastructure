package sortingProblems;

public class KthSmallestElement {

    // Method to find the kth smallest element
    public int kthSmallest(int[] arr, int k) {
        quickSorting(arr, 0, arr.length - 1);
        return arr[k - 1]; // k is 1-based
    }

    // QuickSort helper
    private void quickSorting(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSorting(arr, left, pivotIndex - 1);
            quickSorting(arr, pivotIndex + 1, right);
        }
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
        KthSmallestElement solver = new KthSmallestElement();

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4; // Find the 3rd smallest element

        int result = solver.kthSmallest(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }
}

//Time Complexity: O(log n) on average, O(n) worst case
// Space Complexity: O(1)

