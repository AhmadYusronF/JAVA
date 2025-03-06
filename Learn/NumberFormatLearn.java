package Learn;

// Importing necessary classes for number formatting and locale-specific formatting
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatLearn {
    public static void main(String[] args) {
        // Create a general-purpose NumberFormat instance for formatting numbers
        NumberFormat formater = NumberFormat.getInstance();

        // Create a NumberFormat instance for formatting currency specific to the UK locale
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);

        // The amount to be formatted
        int amount = 21555;

        // Format the amount as a general number (e.g., adding commas for thousands)
        String formatresult = formater.format(amount);

        // Print the original number before formatting
        System.out.print("Before Format : ");
        System.out.println(amount);

        // Print the formatted result as a general number
        System.out.print("Format Result : ");
        System.out.println(formatresult);

        // Format and print the number as a currency specific to the UK locale
        System.out.print("Formatted to locale currency : ");
        System.out.println(currency.format(amount)); // This formats the 'amount' as £21,555.00

        // Additional note about NumberFormat functionality
        System.out.println();
        System.out.println("Note: NumberFormat works on numeric data types such as int, long, or double, "
                + "and outputs human-readable strings or parses strings back to numbers.");
    }
}
