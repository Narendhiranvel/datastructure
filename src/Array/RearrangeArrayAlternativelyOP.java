package Array;
//https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
import java.util.Arrays;

public class RearrangeArrayAlternativelyOP {

    static class Solution {
        public void rearrange(int arr[]) {

            int n = arr.length;
            Arrays.sort(arr);

            int minId = 0;
            int maxId = n - 1;

            int maxElement = arr[maxId] + 1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
//                  arr[i] = oldValue + newValue * maxElement
                    arr[i] += (arr[maxId] % maxElement) * maxElement;
                    maxId--;
                } else {
//                    arr[i] = oldValue + newValue * maxElement
                    arr[i] += (arr[minId] % maxElement) * maxElement;
                    minId++;
                }
            }

            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] / maxElement;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 2, 3, 4, 5, 6};
        s.rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}

// Time Complexity: O(n log n)
// Space Complexity: O(1)

