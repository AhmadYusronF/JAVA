

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // Initialize a 3x3 array
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;

        // Print the array using Arrays.toString (will display memory address)
        System.out.println(Arrays.toString(numbers)); // Output: [[I@someHashCode, [I@someHashCode, [I@someHashCode]

        // Print the array using Arrays.deepToString (will display array content)
        System.out.println(Arrays.deepToString(numbers)); // Output: [[1, 0, 0], [0, 0, 0], [0, 0, 0]]

        // Initialize a 3x3 array with predefined values
        int[][] numbers1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Print the array using Arrays.deepToString (will display array content)
        System.out.println(Arrays.deepToString(numbers1)); // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
