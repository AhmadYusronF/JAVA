package Learn;

public class PrintFr {
    // Printf() = an optional method to control, format, adn display text to the
    // console window
    // two arguments = format stringt +(object/variable/value)
    // %[flags] [precision] [width] [conversion-character]
    public static void main(String[] args) {
        String nama = "GioGio";
        int age = 21;
        char bloodtype = 'A';
        // [conversion-character]
        System.out.printf("Hello %s %d %c %n", nama, age, bloodtype);
        // [width]
        System.out.printf("Hello %5s %6d %7c %n", nama, age, bloodtype);
        // [precision]
        System.out.printf("Hello %s %d %c %n", nama, age, bloodtype);
        System.out.printf("Hello %s %d %c %n", nama, age, bloodtype);

    }
}
