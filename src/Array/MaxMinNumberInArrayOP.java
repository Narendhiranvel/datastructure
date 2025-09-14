package Array;

//Problem: Find the largest and smallest element in an array.
//        Input: [3, 1, 7, 4, 9]
//        Output: Max: 9, Min: 1

public class MaxMinNumberInArrayOP {
    public static void main(String[] args) {
        int[] arr = {54, 7, 99, 34, 89, 15, 11, 64, 5, 25};
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println(min+", "+max);
    }
}
// Time Complexity O(n)
// Space complexity O(1)