package Learn;

public class Setering {
    public static void main(String[] args) {
        String name = "Shogun Rakedan          ";
        double lvl = 62.3;

        // Replace 'o' with 'He he'
        String hehe = name.replace("o", "He he");
        System.out.println(hehe);

        // Remove trailing white spaces
        String trimmedName = name.trim();
        System.out.println(trimmedName);

        // Format string with name and level
        String formattedString = String.format("My Name is %s And I am lvl %.1f", trimmedName, lvl);
        System.out.println(formattedString);
    }
}
