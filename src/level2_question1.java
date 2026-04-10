import java.util.Scanner;

public class Level2Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isNaturalNumber = number >= 1;
        if (!isNaturalNumber) {
            System.out.println("The number " + number + " is not a natural number.");
            input.close();
            return;
        }

        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            boolean isEven = (currentNumber % 2 == 0);
            if (isEven) {
                System.out.println(currentNumber + " is an even number");
            } else {
                System.out.println(currentNumber + " is an odd number");
            }
        }

        input.close();
    }
}