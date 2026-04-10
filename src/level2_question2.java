import java.util.Scanner;

public class Level2Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonusPercentage = 0.05;
        double bonusAmount;

        if (yearsOfService > 5) {
            bonusAmount = salary * bonusPercentage;
        } else {
            bonusAmount = 0.0;
        }

        System.out.println("Bonus amount: " + bonusAmount);

        input.close();
    }
}