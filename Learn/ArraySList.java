package Learn;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySList {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to dynamically store integers
        ArrayList<Integer> nulist = new ArrayList<>();

        // Initialize the ArrayList with a default value
        nulist.add(1); // Add initial value to the ArrayList

        // Loop to collect user inputs until 0 is entered
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int adput = scanner.nextInt(); // Read user input

            if (adput == 0) { // If input is 0, exit the loop
                break;
            }
            nulist.add(adput); // Add the input value to the ArrayList
        }

        // Print all elements of the ArrayList in a single line, separated by "--"
        System.out.print("ArrayList contents: ");
        for (int i = 0; i < nulist.size(); i++) {
            System.out.print(nulist.get(i)); // Print each element
            if (i < nulist.size() - 1) {
                System.out.print("--"); // Add separator between elements
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}