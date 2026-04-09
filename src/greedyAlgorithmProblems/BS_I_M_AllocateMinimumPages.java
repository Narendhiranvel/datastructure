package greedyAlgorithmProblems;

//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

public class BS_I_M_AllocateMinimumPages {

    static class Solution {
        public int findPages(int[] arr, int k) {

            int n = arr.length;
            if (k > n) return -1;

            int start = 0;
            int end = 0;

            for (int pages : arr) {
                start = Math.max(start, pages);
                end += pages;
            }

            int ans = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (canAllocate(arr, k, mid)) {
                    ans = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return ans;
        }

        private boolean canAllocate(int[] arr, int k, int maxPages) {
            int students = 1;
            int pagesSum = 0;

            for (int pages : arr) {
                if (pagesSum + pages <= maxPages) {
                    pagesSum += pages;
                } else {
                    students++;
                    pagesSum = pages;
                }
            }
            return students <= k;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {12, 34, 67, 90};
        int k = 2;

        int result = s.findPages(arr, k);
        System.out.println("Minimum pages = " + result);
    }
}

//Time Complexity  = O(n log(sum(arr)))
//Space Complexity = O(1)
