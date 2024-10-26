import java.util.Scanner; // Import the Scanner class for user input

public class Exam {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variables to hold the marks for assignments and CATs
        double asgnmnt1, asgnmnt2, cat1, cat2;

        // Prompt the tutor to enter marks for assignments and CATs
        System.out.print("Enter marks for Assignment 1: ");
        asgnmnt1 = scanner.nextDouble(); // Read the mark for Assignment 1
        
        System.out.print("Enter marks for Assignment 2: ");
        asgnmnt2 = scanner.nextDouble(); // Read the mark for Assignment 2
        
        System.out.print("Enter marks for CAT 1: ");
        cat1 = scanner.nextDouble(); // Read the mark for CAT 1
        
        System.out.print("Enter marks for CAT 2: ");
        cat2 = scanner.nextDouble(); // Read the mark for CAT 2

        // Calculate the average of the coursework
        double average = (asgnmnt1 + asgnmnt2 + cat1 + cat2) / 4;

        // Print the average of the coursework
        System.out.println("Coursework Average: " + average);

        // Determine and print the grade based on the average
        if (average >= 40 && average <= 50) {
            System.out.println("Grade: A"); // Grade A for average between 40 and 50
        } else if (average >= 30 && average < 40) {
            System.out.println("Grade: B"); // Grade B for average between 30 and 39
        } else if (average >= 20 && average < 30) {
            System.out.println("Grade: C"); // Grade C for average between 20 and 29
        } else if (average >= 10 && average < 20) {
            System.out.println("Grade: D"); // Grade D for average between 10 and 19
        } else {
            System.out.println("Invalid average. Please ensure marks are within the correct range."); // Invalid average case
        }

        // Close the scanner to free resources
        scanner.close();
    }
}