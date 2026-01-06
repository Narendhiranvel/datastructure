package Array;

import java.util.Arrays;

public class EquilibriumPoint {

    static class Solution {

        public static int findEquilibrium(int arr[]) {
            int n = arr.length;
            int totalSum = 0;
            int leftSum = 0;

            // Calculate total sum of array
            for (int i = 0; i < n; i++) {
                totalSum += arr[i];
            }

            // Find equilibrium point
            for (int i = 0; i < n; i++) {
                if (leftSum == totalSum - leftSum - arr[i]) {
                    return i; // index of equilibrium point
                }
                leftSum += arr[i];
            }

            return -1; // no equilibrium point
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2}; // sample input

        int equilibriumIndex = Solution.findEquilibrium(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium point found at index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium point found.");
        }
    }
}

