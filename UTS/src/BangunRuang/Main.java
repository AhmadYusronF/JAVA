package BangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Kalkulator Bangun Ruang");
        System.out.println("\n=== Menu Utama ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Silinder");
        System.out.println("4. Bola");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();
        int subPilihan;

        switch (pilihan) {
            case 1: // Kubus

                System.out.print("Masukkan panjang sisi: ");
                int sisi = input.nextInt();
                Calculation kubus = new Calculation(sisi);
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();
                if (subPilihan == 1) {
                    System.out.println("Volume Kubus: " + kubus.hitungVolumeKubus());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus());
                }
                break;

            case 2: // Balok

                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                Calculation balok = new Calculation(panjang, lebar, tinggi);
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();
                if (subPilihan == 1) {
                    System.out.println("Volume Balok: " + balok.hitungVolumeBalok());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok());
                }
                break;

            case 3: // Silinder

                System.out.print("Masukkan jari-jari: ");
                double jariJariSilinder = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSilinder = input.nextDouble();
                Calculation silinder = new Calculation(tinggiSilinder, jariJariSilinder);
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();
                if (subPilihan == 1) {
                    System.out.println("Volume Silinder: " + silinder.hitungVolumeSilinder());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Silinder: " + silinder.hitungLuasPermukaanSilinder());
                }
                break;

            case 4: // Bola

                System.out.print("Masukkan jari-jari: ");
                double jariJariBola = input.nextDouble();
                Calculation bola = new Calculation(jariJariBola);
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();
                if (subPilihan == 1) {
                    System.out.println("Volume Bola: " + bola.hitungVolumeBola());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaanBola());
                }
                break;

            case 5:
                System.out.println("Terima kasih telah menggunakan kalkulator. Sampai jumpa!");
                break;

            default:
                System.out.println("Pilihan tidak valid. Masukkan angka 1 sampai 5.");
        }

        input.close();
    }
}
