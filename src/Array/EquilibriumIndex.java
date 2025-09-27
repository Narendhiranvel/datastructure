package Array;

//Equilibrium Index (left sum = right sum)
//Input: [1,7,3,6,5,6]
//Output: Index = 3

import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int equilibriumIndex = -1;
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        prefix[0] = arr[0];
        suffix[arr.length - 1] = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = (i == arr.length - 1) ? 0 : suffix[i + 1];
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break; // if you want only first equilibrium index
            }
        }

        if (equilibriumIndex == -1) {
            System.out.println("No equilibrium index found");
        } else {
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        }

        // Step 3: Print results
        System.out.println("Actual Array  : " + Arrays.toString(arr));
        System.out.println("Prefix Array  : " + Arrays.toString(prefix));
        System.out.println("Suffix Array  : " + Arrays.toString(suffix));
    }
}

// Time Complexity O(n)
// Space Complexity O(n)
