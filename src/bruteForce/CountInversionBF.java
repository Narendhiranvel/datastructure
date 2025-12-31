package bruteForce;

public class CountInversionBF {

    static class Solution {
        static int inversionCount(int arr[]) {
            int count = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        int result = Solution.inversionCount(arr);
        System.out.println("Inversion Count = " + result);
    }
}

// Time Complexity: O(n²)
// Space Complexity: O(1)

