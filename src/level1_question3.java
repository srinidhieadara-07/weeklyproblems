import java.util.Scanner;

public class Level1Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();

        System.out.print("Enter number3: ");
        double number3 = input.nextDouble();

        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        input.close();
    }
}