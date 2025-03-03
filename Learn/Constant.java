package Learn;

public class Constant {
    public static void main(String[] args) {
        float pi = 3.14f;
        pi = 4; // you can change the value
        System.out.println(pi);

        final float pi2 = 3.14f;
        // pi2 = 4; // cannot change the value because of final (This line will cause an
        // error if uncommented)
        System.out.println(pi2);
    }
}
