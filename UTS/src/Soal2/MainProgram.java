package Soal2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    List<Tax> listData = new ArrayList<>();

    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        Scanner input = new Scanner(System.in);
        System.out.print("Input how many smartphone you want to calculate: ");
        int phoneAmount;
        phoneAmount = input.nextInt();
        input.nextLine();

        System.out.println();

        for (int i = 1; i <= phoneAmount; i++) {
            mainProgram.addData(i, input);
        }
        System.out.println();

        mainProgram.showData();
    }

    public void addData(int i, Scanner input) {
        System.out.println("---- Smartphone " + i + " ----");
        System.out.print("Input smartphone brand: ");
        String brand = input.nextLine();
        System.out.print("Input smartphone type: ");
        String type = input.nextLine();
        System.out.print("Input smartphone price: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("");
        listData.add(new Tax(brand, type, price));
    }

    public void showData() {
        for (int i = 0; i < listData.size(); i++) {
            Tax tax = new Tax(null, null, i);
            double onlyTax = tax.calculateTax(listData.get(i).price);
            double onlyPrice = listData.get(i).price;
            double priceTax = onlyTax + onlyPrice;
            System.out.println("---- Smartphone " + (i + 1) + " ----");
            System.out.println("Brand: " + listData.get(i).brand);
            System.out.println("Type: " + listData.get(i).type);
            System.out.printf("Price: Rp %, .2f%n", onlyPrice);
            System.out.printf("Tax: Rp %, .2f%n", onlyTax);
            System.out.printf("Price with tax: Rp %, .2f%n", priceTax);
            System.out.println(" ");
        }

    }
}
