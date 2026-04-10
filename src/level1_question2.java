import java.util.Scanner;

public class Level1Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();

        System.out.print("Enter number3: ");
        double number3 = input.nextDouble();

        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        input.close();
    }
}