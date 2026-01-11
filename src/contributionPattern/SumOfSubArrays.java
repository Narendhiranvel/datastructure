package contributionPattern;
//https://www.geeksforgeeks.org/problems/sum-of-subarrays2229/1
public class SumOfSubArrays {

    static class Solution {
        public int subarraySum(int[] arr) {
            int n = arr.length;
            int sumOfArr = 0;

            for (int i = 0; i < n; i++) {
                sumOfArr += arr[i] * (i + 1) * (n - i);
            }
            return sumOfArr;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 2, 3}; // sample input

        int result = s.subarraySum(arr);
        System.out.println("Sum of all subarrays = " + result);
    }
}

//Time Complexity: O(n)
//Space Complexity : O(1)
