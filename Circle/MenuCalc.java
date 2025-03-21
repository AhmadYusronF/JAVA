package Circle;

import java.util.Scanner;

public class MenuCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome To Circle Calculator");
        System.out.print("Before We Start Please Put Desired Radius of Circle: ");
        int radius = scanner.nextInt();

        do {
            String pause;
            ClearConsole.clearconsole(); // Clear the console before menu
            System.out.println("1. Circumference");
            System.out.println("2. Area");
            System.out.println("3. Change the radius");
            System.out.println("4. Exit");
            System.out.println("Choose What To Calculate:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double circumference = Circumference.caclulateCircumference(radius);
                    System.out.println("The circumference of the circle is: " + circumference);
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    pause = scanner.nextLine();
                    break;
                case 2:
                    double area = Area.AreaCalc(radius);
                    System.out.println("The area of the circle is: " + area);
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    pause = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Put the new radius: ");
                    radius = scanner.nextInt();
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    pause = scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Please pick a valid choice.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
