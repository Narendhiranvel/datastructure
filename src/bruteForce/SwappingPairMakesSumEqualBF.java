package bruteForce;

public class SwappingPairMakesSumEqualBF {

    static class Solution {
        boolean findSwapValues(int[] a, int[] b) {
            int aSum = 0;
            int bSum = 0;

            for (int i = 0; i < a.length; i++) {
                aSum += a[i];
            }

            for (int i = 0; i < b.length; i++) {
                bSum += b[i];
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (aSum - a[i] + b[j] == bSum - b[j] + a[i]) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {4, 1, 2, 1, 1, 2};
        int[] b = {3, 6, 3, 3};

        boolean result = s.findSwapValues(a, b);
        System.out.println(result);
    }
}

// Time Complexity: O(n²)
// Space Complexity: O(1)

