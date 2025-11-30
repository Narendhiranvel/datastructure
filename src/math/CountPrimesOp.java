package math;

public class CountPrimesOp {

    static class Solution {
        public int countPrimes(int n) {
            if (n <= 2) {
                return 0;
            }
            boolean[] isPrime = new boolean[n];
            for (int i = 2; i < n; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    for (long j = (long) i * i; j < n; j += i) {
                        isPrime[(int) j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) count++;
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 20;  // sample input
        int result = s.countPrimes(n);

        System.out.println("Number of primes less than " + n + " = " + result);
    }
}

//Time Complexity — O(n log log n)
//Space Complexity - O(n)

