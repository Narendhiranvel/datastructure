package math;

public class PrimeOrNotOp {

    public static boolean checkPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 11;
        boolean isprime = checkPrime(num);
        System.out.println(num + " isPrime: " + isprime);
    }
}

// Time Complexity: O(√n)
// Space Complexity: 0(1)