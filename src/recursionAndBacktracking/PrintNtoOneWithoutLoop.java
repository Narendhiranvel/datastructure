package recursionAndBacktracking;
//https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

public class PrintNtoOneWithoutLoop {

    static class Solution {

        void printNos(int N) {
            // print current number
            System.out.print(N + " ");
            // recursive call until 1
            if (N != 1) {
                printNos(N - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int N = 10; // sample input
        System.out.println("Printing numbers from " + N + " to 1:");
        s.printNos(N);
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)

