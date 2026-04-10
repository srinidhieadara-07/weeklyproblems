import java.util.Scanner;

public class Level2Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double areaSqCm = 0.5 * baseCm * heightCm;
        double cmPerInch = 2.54;
        double areaSqIn = areaSqCm / (cmPerInch * cmPerInch);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn
                + " and sq cm is " + areaSqCm);

        input.close();
    }
}