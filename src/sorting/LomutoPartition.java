package sorting;

public class LomutoPartition {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void partition(int[] arr, int left, int right) {
        int i = left - 1;
        int pivot = arr[right];
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
    }

    // Printing the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Before Lomuto Partition");
        printArray(arr);

        System.out.println("After Lomuto Partition");
        partition(arr, left, right);
        printArray(arr);
    }
}
