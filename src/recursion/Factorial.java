package recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 5;
        System.out.println(findFactorial(factorial));
    }

    private static long findFactorial(int n) {
        if (n < 0)
            return -1;

        if (n == 0 || n == 1)
            return 1;

        return n * findFactorial(n - 1);
    }
}

//Time Complexity: O(n) - Each recursive call computes findFactorial(n-1) once — no repeated branches like Fibonacci.
//Space Complexity: O(n) - Each recursive call stays on the call stack until the base case is reached.