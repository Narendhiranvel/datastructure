package sorting;

//In place Sorting
//Stable Sorting
//Input: arr=[5,9,3,1,2,8,4,7,6]
//Output: [1,2,3,4,5,6,7,8,9]

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        insertionSorting(arr);
    }

    private static void insertionSorting(int[] arr) {
        for(int i =1; i<arr.length; i++){
            int temp = arr[i];
            int j =i;
            while(j>0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        for (int num : arr) {
            System.out.printf(num + " ");
        }
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)
