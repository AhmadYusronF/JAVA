package Circle;

public class ClearConsole {
    public static void clearconsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Could not clear the console!");
        }
    }
}
