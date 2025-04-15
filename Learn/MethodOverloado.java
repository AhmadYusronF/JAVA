package Learn;

public class MethodOverloado {
    // Method overloading means defining multiple methods with the same name but
    // have different parameter lists.

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println(add(c, d));
        System.out.println(add(b, d, c));
        System.out.println(add(a, b, c, d));
    }

    static int add(int x, int y) {
        System.out.println("Method #1");
        return x + y;
    }

    static int add(int x, int y, int c) {
        System.out.println("Method #2");
        return x + y + c;
    }

    static int add(int x, int y, int c, int z) {
        System.out.println("Method #3");
        return x + y + c + z;
    }
}
