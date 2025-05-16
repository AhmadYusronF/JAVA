

public class Method {

    // A block of code that performs a task, reusable and organized for better
    // programming.
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        String name = "JO JO ";
        hello(name, add(x, y));
    }

    static int add(int x, int y) {
        return x + y;

    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + age);

    }
}
