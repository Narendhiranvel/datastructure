package binarySearchOnAnswer;

//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

public class BS_I_M_AllocateMinimumPages {

    static class Solution {
        public int findPages(int[] arr, int k) {

            if (k > arr.length) return -1;

            long minPages = 0;
            long maxPages = 0;

            for (int num : arr) {

                minPages = Math.max(num, minPages);
                maxPages += num;
            }

            long ans = -1;

            while (minPages <= maxPages) {

                long mid = minPages + (maxPages - minPages) / 2;

                if (canAllocate(arr, k, mid)) {

                    ans = mid;
                    maxPages = mid - 1;
                } else {
                    minPages = mid + 1;
                }
            }
            return (int) ans;
        }

        private boolean canAllocate(int[] arr, int k, long maxPages) {

            int students = 1;
            long pagesSum = 0;

            for (int page : arr) {

                if (pagesSum + page <= maxPages) {
                    pagesSum = pagesSum + page;
                } else {
                    students++;
                    pagesSum = page;
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

//Time Complexity  = O(n log(sum(arr))) = = O(n log n)
//Space Complexity = O(1)
