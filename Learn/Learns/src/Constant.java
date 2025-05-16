

public class Constant {
    public static void main(String[] args) {
        // Declare a float variable that can be modified
        float pi = 3.14f;
        pi = 4; // Value can be changed
        System.out.println("Modifiable pi: " + pi); // Output: 4.0

        // Declare a constant using 'final'
        final float pi2 = 3.14f;
        // pi2 = 4; // Uncommenting this line will cause a compilation error since pi2
        // is final
        System.out.println("Constant pi2: " + pi2); // Output: 3.14
    }
}
