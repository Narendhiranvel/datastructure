package TwoPointerArray;
//https://www.geeksforgeeks.org/dsa/count-pairs-with-given-sum-in-sorted-array/

public class TwoSumCountPairSumSortedArray {
    public static void main(String[] args){
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;

        int count = sumCount(arr, target);
        System.out.println("Number of pairs of target: " + count);
    }

    private static int sumCount(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                // Case 1: both values equal
                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }
                // Case 2: values different
                int leftCount = 1;
                int rightCount = 1;

                while (left + 1 < right && arr[left] == arr[left + 1]) {
                    leftCount++;
                    left++;
                }
                while (right - 1 > left && arr[right] == arr[right - 1]) {
                    rightCount++;
                    right--;
                }
                count += leftCount * rightCount;
                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
