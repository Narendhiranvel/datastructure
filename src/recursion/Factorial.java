package recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 5;
            System.out.println(findFactorial(factorial));
    }

    private static long findFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
//        System.out.println(n);
        return n * findFactorial(n - 1);
    }
}
