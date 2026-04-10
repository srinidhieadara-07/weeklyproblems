import java.util.Scanner;

public class Level1PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nVoting eligibility results:");
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}