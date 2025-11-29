package math;

public class CountPrimes {

    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int count = 0;
        for (int j = 2; j < n; j++) {
            boolean isPrime = true;

            if (j == 2) {
                count++;
                continue;
            }
            if (j % 2 == 0)
                continue;

            for (int i = 3; i * i <= j; i += 2) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 417103;
        System.out.println("Number of primes within " + num + " is " + countPrimes(num));
    }
}
