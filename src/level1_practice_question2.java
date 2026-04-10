import java.util.Scanner;

public class Level1PracticeQuestion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumber classification:");
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];

            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is positive and even.");
                } else {
                    System.out.println(n + " is positive and odd.");
                }
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println(n + " is zero.");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        }

        input.close();
    }
}