package TwoPointerArray;

public class MoveAllZerosToEndMaintainingOrderTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        MoveAllZerosToEndMaintainingOrderTwo obj = new MoveAllZerosToEndMaintainingOrderTwo();
        obj.moveZeroes(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public void moveZeroes(int[] nums) {
        int firstPointer = 0;
        int secondPointer = 1;

        while (secondPointer < nums.length) {
            if (nums[firstPointer] == 0 && nums[secondPointer] != 0) {
                nums[firstPointer] = nums[secondPointer];
                nums[secondPointer] = 0;
                firstPointer++;
                secondPointer++;
            } else if (nums[firstPointer] == 0 && nums[secondPointer] == 0) {
                secondPointer++;
            } else {
                firstPointer++;
                secondPointer++;
            }
        }
    }
}

// Time Complexity O(n) - Ignore printing for loop
// Space complexity O(1)
