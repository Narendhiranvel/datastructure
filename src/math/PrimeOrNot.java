package math;

public class PrimeOrNot {

    public static boolean checkPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 3;
        boolean isprime = checkPrime(num);
        System.out.println(num + " isPrime: " + isprime);
    }
}

// Time Complexity: O(n)
// Space Complexity: 0(1)
