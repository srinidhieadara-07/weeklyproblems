import java.util.Scanner;

public class Level3Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int gregorianStartYear = 1582;

        // Part A
        if (year < gregorianStartYear) {
            System.out.println("[Part A] Year " + year
                    + " is not valid for LeapYear program (year must be >= " + gregorianStartYear + ").");
        } else {
            if (year % 400 == 0) {
                System.out.println("[Part A] Year " + year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("[Part A] Year " + year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("[Part A] Year " + year + " is a Leap Year");
            } else {
                System.out.println("[Part A] Year " + year + " is NOT a Leap Year");
            }
        }

        // Part B
        if (year < gregorianStartYear) {
            System.out.println("[Part B] Year " + year
                    + " is not valid for LeapYear program (year must be >= " + gregorianStartYear + ").");
        } else {
            boolean divisibleBy4 = (year % 4 == 0);
            boolean divisibleBy100 = (year % 100 == 0);
            boolean divisibleBy400 = (year % 400 == 0);

            boolean isLeapYear = divisibleBy4 && (!divisibleBy100 || divisibleBy400);

            if (isLeapYear) {
                System.out.println("[Part B] Year " + year + " is a Leap Year");
            } else {
                System.out.println("[Part B] Year " + year + " is NOT a Leap Year");
            }
        }

        input.close();
    }
}