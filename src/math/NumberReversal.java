package math;

//Sample Input: 237
//Output: 732

public class NumberReversal {

    public static int reverseTheNumber(int num) {
        int reversal = 0;

        while (num > 0) {
            int reminder = num % 10;
            reversal = reversal * 10 + reminder;
            num = num / 10;
        }
        return reversal;
    }

    public static void main(String[] args) {
        int num = 123450;
        System.out.println("Number before reversal: " + num);
        System.out.println("Number after reversal: " + reverseTheNumber(num));
    }
}
