
public class Wrapperclass {
    public static void main(String[] args) {
        int num = 100; // Primitive type
        Integer wrappedNum = num; // Auto-boxing
        System.out.println(wrappedNum); // Output: 100

        num = 200; // Change primitive value
        System.out.println(num); // Output: 200
        System.out.println(wrappedNum); // Output: 100 (wrapper is unaffected)

        wrappedNum = 300; // Change wrapper value (creates new object)
        System.out.println(wrappedNum); // Output: 300

        int unboxedNum = wrappedNum; // Auto-unboxing
        System.out.println(unboxedNum); // Output: 300

    }
}
