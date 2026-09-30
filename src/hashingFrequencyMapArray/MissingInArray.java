package hashingFrequencyMapArray;

//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

import java.util.HashSet;
import java.util.Set;

public class MissingInArray {

    static class Solution {

        int missingNum(int[] arr) {

            int n = arr.length + 1;

            Set<Integer> set = new HashSet<>();

            // Store all array elements in HashSet
            for (int num : arr) {
                set.add(num);
            }

            // Check numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {1, 2, 3, 5};

        int missingNumber = solution.missingNum(arr);

        System.out.println("Missing number: " + missingNumber);
    }
}
