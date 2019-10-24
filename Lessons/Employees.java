import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        // Create a new scanner to take user input
        Scanner keyboard = new Scanner(System.in);

        // Initialize three hours
        // int workHours1, workHours2, workHours3;

        // Create an array that can hold three integers
        int[] employeeHours = new int[3];

        // Prompt the user to enter three employee hours
        System.out.println("Please enter three numbers.");

        // Average work hours
        double avgHours = 0;

        // Loop through the array
        for(int i = 0; i < employeeHours.length; i++) {            
            // Take user input and set it to the appropriate "employee work hours"
            System.out.print("Employee " + (i + 1) + ": ");
            employeeHours[i] = keyboard.nextInt();
            // Add the value to our average hours
            avgHours += employeeHours[i];
        }

        avgHours = avgHours / employeeHours.length;

        // Close the scanner
        keyboard.close();

        // average work hours
        System.out.println("You have " + employeeHours.length + " employees that work an average of " + avgHours + " hours.");
    }
}