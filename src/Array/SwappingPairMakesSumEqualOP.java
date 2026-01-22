package Array;
//https://www.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1

import java.util.HashSet;

public class SwappingPairMakesSumEqualOP {

    static class Solution {
        boolean findSwapValues(int[] a, int[] b) {
            int aSum = 0;
            int bSum = 0;

            for (int x : a) {
                aSum += x;
            }
            for (int y : b) {
                bSum += y;
            }

            int diff = bSum - aSum;

            // If difference is odd, equal sum is impossible
            if (diff % 2 != 0) {
                return false;
            }

            int target = diff / 2;

            HashSet<Integer> setB = new HashSet<>();
            for (int y : b) {
                setB.add(y);
            }

            for (int x : a) {
                if (setB.contains(x + target)) {
                    return true;
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

//Time Complexity: O(n + m)
//Space Complexity: O(m)
