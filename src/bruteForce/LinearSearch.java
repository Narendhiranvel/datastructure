package bruteForce;

//Problem: Check if a number exists in an array.
//Input: arr = [5, 2, 8, 3], target = 8
//Output: Found at index 2

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 8};
        int target = 8;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target 8 " + " found at " + (i + 1));
            }
        }
    }
}
