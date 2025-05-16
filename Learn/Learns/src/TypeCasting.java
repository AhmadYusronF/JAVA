

public class TypeCasting {
    public static void main(String[] args) {
        // Declare an integer variable
        int x = 2;

        // Type casting: (double) converts the integer 'x' to a double
        double y = (double) x + 2.2;

        // Declare a string variable
        String a = "21";

        // Integer.parseInt(a) converts the string 'a' to an integer
        int e = Integer.parseInt(a) + 21;

        // Print the results
        System.out.println("Result of (double) type casting: " + y); // Output: 4.2
        System.out.println("Result of Integer.parseInt: " + e); // Output: 42
    }
}
