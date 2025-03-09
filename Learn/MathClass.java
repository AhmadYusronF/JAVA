package Learn;

public class MathClass {
    public static void main(String[] args) {
        // Math.random() generates a random number between 0.0 (inclusive) and 1.0
        // (exclusive),
        // so multiplying it scales the range, and (int) casts it to an integer.
        int radon = (int) (Math.random() * 20);

        // Math.floor rounds the value down to the nearest integer.
        double flor = Math.floor(1.2f);

        // Math.ceil rounds the value up to the nearest integer.
        double cel = Math.ceil(1.2f);

        // Print the results.
        System.out.println("Ceil: " + cel); // Prints 2.0
        System.out.println("Floor: " + flor); // Prints 1.0
        System.out.println("Random integer (0 to 19): " + radon); // Random value in range 0 to 19
        int p = 2;

        System.out.println(Math.pow(p, 3));
    }
}
