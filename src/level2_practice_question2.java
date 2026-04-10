import java.util.Scanner;

public class Level2PracticeQuestion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age and height for Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n" + names[i]);

            System.out.print("Age: ");
            int age = input.nextInt();

            System.out.print("Height (in cm): ");
            double height = input.nextDouble();

            if (age < 0 || height < 0) {
                System.out.println("Invalid input. Age and height must be >= 0. Please enter again.");
                i--;
                continue;
            }

            ages[i] = age;
            heights[i] = height;
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}