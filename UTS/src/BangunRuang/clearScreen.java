package BangunRuang;
import java.io.IOException;

public class clearScreen {
    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println("tid ak bisa clear screen");
        }
    }
}
