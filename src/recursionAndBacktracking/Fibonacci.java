package recursionAndBacktracking;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        if (n < 0) {
            System.out.print(-1);
        } else {
            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

//Time Complexity: O(2^n)
//Space Complexity: O(n)
