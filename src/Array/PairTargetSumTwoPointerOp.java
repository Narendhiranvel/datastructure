package Array;

//Pair with target sum in sorted array
//Input: [1,2,3,4,6], target=6
//Output: (2,4)

public class PairTargetSumTwoPointerOp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        pairSum(arr, target);
    }

    private static void pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                return;  // stop after finding the first pair
            }

            else if (sum < target) {
                left++;   // need a bigger sum → move left pointer right
            }
            else {
                right--;  // need a smaller sum → move right pointer left
            }
        }
    }
}

// Time complexity O(n)
// Space complexity O(1)

//2 pointer works only if
// Array is Sorted(Asc or desc)
// Only 2 numbers needs to be summed?