import java.util.Scanner;

/**
 * The Main class is a test driver that creates instances of the GoodDay class,
 * updates its properties, and prints results based on the current day status.
 */
public class Main {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of GoodDay using the parameterized constructor
        System.out.println("Enter the current temperature:");
        int temp = scanner.nextInt();

        System.out.println("Enter the current humidity percentage:");
        double humidity = scanner.nextDouble();

        System.out.println("Have you completed all your homework? (true/false):");
        boolean homeworkDone = scanner.nextBoolean();

        scanner.nextLine(); // Consume the newline character

        System.out.println("What is your planned dinner meal? (if unsure, type 'unknown') ");
        String dinner = scanner.nextLine();

        GoodDay myDay = new GoodDay(temp, humidity, homeworkDone, dinner);

        // Test the isTodayGood method
        System.out.println("\nIs today a good day?");
        if (myDay.isTodayGood()) {
            System.out.println("Yes, today is a good day!");
        } else {
            System.out.println("No, today is not a good day.");
        }

        // Test the toString method
        System.out.println("\nDay description: ");
        System.out.println(myDay.toString());

        // Close the scanner
        scanner.close();
    }
}


