package Array;

import java.util.ArrayList;
import java.util.List;

//Input: arr[] = [2, 3, 1, 2, 3]
//Output: [2, 3]
//Explanation: 2 and 3 occur more than once in the given array.

public class FindDublicatesInArrayLC {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            // If already negative → number is repeated
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                // Mark it visited by making it negative
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }

    // Sample test
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDuplicates(nums);

        System.out.println("Input:  [4, 3, 2, 7, 8, 2, 3, 1]");
        System.out.println("Output: " + result);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
