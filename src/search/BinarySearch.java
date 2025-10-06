package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,11};

        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, 9));
        System.out.println(binarySearch(arr, 11));
    }
    private static int binarySearch(int[] arr, int targetNum){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == targetNum) {
                return middle;
            } else if (arr[middle] < targetNum) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}

//Time Complexity : O(log n)
//Space Complexity: O(1)
