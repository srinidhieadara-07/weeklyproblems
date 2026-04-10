public class Level1Question2 {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;

        double average = (maths + physics + chemistry) / (double) totalSubjects;

        // Using normal apostrophe to avoid encoding issues:
        System.out.println("Sam's average mark in PCM is " + average);
    }
}