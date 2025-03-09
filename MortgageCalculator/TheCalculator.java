package MortgageCalculator;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Principal : Amount of loan = User Input
// Annual Interest Rate : = User Input
// Period (Years) : = User Input
// Mortgage : On Currency Format = Result

// Formula
// M = P r(1+r)^n / (1+r)^n-1
public class TheCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);

        System.out.print("Principal : ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        double AIR = scanner.nextDouble();
        AIR = (AIR / 100) / 12; // Percentage and monthly rate

        System.out.print("Period (Years) : ");
        int period = scanner.nextInt();
        period *= 12; // Months in years

        scanner.close();

        double numerator = AIR * Math.pow((1 + AIR), period);
        double denominator = Math.pow((1 + AIR), period) - 1;
        double results = principal * (numerator / denominator);

        System.out.println("Mortgage : " + currency.format(results));
    }
}
