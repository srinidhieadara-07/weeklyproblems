import java.util.Scanner;

public class Level1Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isNaturalNumber = (number >= 0);
        if (isNaturalNumber) {
            long n = number;
            long sumOfNNaturalNumbers = n * (n + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNNaturalNumbers);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}