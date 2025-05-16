package Jonoko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pajak pajak = new Pajak();

        System.out.println("Welcome To Pajak Pakai Nanya (PPN)");
        // >vendor > tipe > harga if harga calc = new harga
        System.out.print("Input Barang: ");
        String vendor = input.nextLine();
        pajak.setVendor(vendor);
        pajak.setVendor("ADa");
        pajak.setVendor("ADaa");
        String tipe = input.nextLine();
        pajak.setTipe(tipe);
        int harga = input.nextInt();
        pajak.setHarga(harga);
        System.out.println("|Vendor\t|" + pajak.getVendor());
        System.out.println("|Tipe\t|");
        System.out.println("|Harga\t|");
    }
}
