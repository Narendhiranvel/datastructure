package PrefixSuffix;
//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
//Equilibrium Index (left sum = right sum)
//Input: [1,7,3,6,5,6]
//Output: Index = 3

public class EquilibriumIndexOp {

    static class Solution {
        public static int findEquilibrium(int arr[]) {
            int n = arr.length;
            int arrTotal = 0;

            for (int sum : arr) {
                arrTotal += sum;
            }

            int equilibriumPoint = -1;
            int leftTotal = 0;

            for (int i = 0; i < n; i++) {
                leftTotal += arr[i];

                if ((leftTotal - arr[i]) == (arrTotal - leftTotal)) {
                    equilibriumPoint = i;
                    break;
                }
            }
            return equilibriumPoint;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        int result = Solution.findEquilibrium(arr);

        System.out.println("Equilibrium Index: " + result);
    }
}

// Time Complexity O(n)
// Space Complexity O(1)
