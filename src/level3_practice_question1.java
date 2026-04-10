import java.util.Scanner;

public class Level3PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if (number < 0) {
            number = -number;
        }

        int digitCount;
        if (number == 0) {
            digitCount = 1;
        } else {
            digitCount = 0;
            long temp = number;
            while (temp > 0) {
                digitCount++;
                temp /= 10;
            }
        }

        int[] digits = new int[digitCount];

        if (number == 0) {
            digits[0] = 0;
        } else {
            long temp = number;
            for (int i = digitCount - 1; i >= 0; i--) {
                digits[i] = (int) (temp % 10);
                temp /= 10;
            }
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit frequencies:");
        for (int d = 0; d <= 9; d++) {
            if (frequency[d] > 0) {
                System.out.println("Digit " + d + " occurs " + frequency[d] + " time(s)");
            }
        }

        input.close();
    }
}