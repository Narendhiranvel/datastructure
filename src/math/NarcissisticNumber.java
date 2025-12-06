package math;

public class NarcissisticNumber {

    // Method to check if number is narcissistic
    public static boolean isNarcissistic(int number) {
        int numberOfDigitCount = 0;
        int narcissisticNumber = 0;
        int countingNumber = number;
        int validateNumber = number;

        // Count digits
        while (countingNumber > 0) {
            numberOfDigitCount++;
            countingNumber /= 10;
        }

        // Calculate narcissistic sum
        while (number > 0) {
            int digit = number % 10;
            int power = 1;

            // Raise digit to the power of numberOfDigitCount
            for (int i = 0; i < numberOfDigitCount; i++) {
                power *= digit;
            }
            narcissisticNumber += power;
            number /= 10;
        }
        return narcissisticNumber == validateNumber;
    }

    public static void main(String[] args) {
        int sampleNumber = 153;   // Sample input

        if (isNarcissistic(sampleNumber)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

