import java.util.Scanner;

public class Level2PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMP_COUNT = 10;

        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];

        double[] bonusAmount = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for " + EMP_COUNT + " employees:");

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Salary: ");
            double s = input.nextDouble();

            System.out.print("Years of service: ");
            double y = input.nextDouble();

            if (s < 0 || y < 0) {
                System.out.println("Invalid input. Salary and years of service must be >= 0. Please enter again.");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            double bonusRate;

            if (years[i] > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            bonusAmount[i] = salary[i] * bonusRate;
            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println(
                "Employee " + (i + 1)
                + " | Old Salary: " + salary[i]
                + " | Years: " + years[i]
                + " | Bonus: " + bonusAmount[i]
                + " | New Salary: " + newSalary[i]
            );
        }

        System.out.println("\n--- Zara Company Totals ---");
        System.out.println("Total old salary payout: " + totalOldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary payout: " + totalNewSalary);

        input.close();
    }
}