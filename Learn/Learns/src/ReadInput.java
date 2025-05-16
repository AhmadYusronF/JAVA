

import java.util.Scanner; // Importing Scanner to handle user input

public class ReadInput {
    public static void main(String[] args) {
        // Create a Scanner instance to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their name
        System.out.print("Please Input Your Name: ");
        String name = scanner.nextLine(); // Read the user's name
        System.out.println("Hello " + name + ", Welcome To This Program!");

        // Prompt the user to input their age
        System.out.print("Please Input Your Age: ");
        int age = scanner.nextInt(); // Read the user's age

        // Use an if-else block to print a custom message based on the user's age
        if (age < 20) {
            System.out.println("Huh, Child 😏");
        } else {
            System.out.println("Well, Hello Good Sire!");
        }

        // Close the Scanner to release resources
        scanner.close();
    }
}
