package TwoPointerArray;

import java.util.Arrays;

public class ReverseString {

    static class Solution {
        public void reverseString(char[] s) {
            int start = 0;
            int end = s.length - 1;

            while (start < end) {
                swap(s, start, end);
                start++;
                end--;
            }
        }

        private void swap(char[] s, int start, int end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before: " + Arrays.toString(arr));

        sol.reverseString(arr);

        System.out.println("After : " + Arrays.toString(arr));
    }
}

