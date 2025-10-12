package sorting;

//Input: arr=[5,9,3,1,2,8,4,7,6]
//Output: [1,2,3,4,5,6,7,8,9]

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        bucketSort(arr);
        System.out.println();
        System.out.print("After Sorting: ");
        printArray(arr);
    }

    // Print Buckets
    private static void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + ":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bucketSort(int[] arr) {
        int arrLen = arr.length;                       // Find the length of array
        int noOfBuckets = (int) Math.sqrt(arrLen);     // Find the sqrt of array
        int maxValue = Integer.MIN_VALUE;

        System.out.print("Before Sorting: ");         //Print array before sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {        // Find the maximum Value in Array
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[noOfBuckets];  // Create number of buckets
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : arr) {
            int bucketNumber = (int) Math.ceil(((float) value * noOfBuckets) / (float) maxValue);    // Add values to buckets
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println();
        System.out.println("Numbers inside buckets before sorting");  //Numbers inside buckets before sorting
        printBucket(buckets);


        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        System.out.println();
        System.out.println("Numbers inside buckets after sorting");  //Numbers inside buckets after sorting
        printBucket(buckets);

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
    }
}

//Time Complexity : O(n log n)
// Space Complexity : O(n)