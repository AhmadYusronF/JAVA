package BangunRuang;

import java.util.Scanner;

public class KalkulatorBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
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
                    while (true) {
                        clearScreen.clear();
                        System.out.print("Masukkan panjang sisi: ");
                        int sisi = input.nextInt();
                        Calculation kubus = new Calculation(sisi);
                        System.out.println("1. Hitung Volume");
                        System.out.println("2. Hitung Luas Permukaan");
                        System.out.println("3. Kembali");
                        System.out.print("Pilihan Anda: ");
                        subPilihan = input.nextInt();

                        switch (subPilihan) {
                            case 1:
                                clearScreen.clear();
                                System.out.println("Volume Kubus: " + kubus.hitungVolumeKubus());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 2:
                                clearScreen.clear();
                                System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 3:
                                clearScreen.clear();
                                break;
                            default:
                                System.out.println("Silakan pilih angka 1-3.");
                                continue;
                        }
                        if (subPilihan == 3)
                            break;
                    }
                    break;

                case 2: // Balok
                    while (true) {
                        clearScreen.clear();
                        System.out.print("Masukkan panjang: ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar: ");
                        double lebar = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        double tinggi = input.nextDouble();
                        Calculation balok = new Calculation(panjang, lebar, tinggi);

                        System.out.println("1. Hitung Volume");
                        System.out.println("2. Hitung Luas Permukaan");
                        System.out.println("3. Kembali");
                        System.out.print("Pilihan Anda: ");
                        subPilihan = input.nextInt();

                        switch (subPilihan) {
                            case 1:
                                clearScreen.clear();
                                System.out.println("Volume Balok: " + balok.hitungVolumeBalok());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 2:
                                clearScreen.clear();
                                System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 3:
                                clearScreen.clear();
                                break;
                            default:
                                System.out.println("Silakan pilih angka 1-3.");
                                continue;
                        }
                        if (subPilihan == 3)
                            break;
                    }
                    break;

                case 3: // Silinder
                    while (true) {
                        clearScreen.clear();
                        System.out.print("Masukkan jari-jari: ");
                        double jariJari = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        double tinggi = input.nextDouble();
                        Calculation silinder = new Calculation(tinggi, jariJari);

                        System.out.println("1. Hitung Volume");
                        System.out.println("2. Hitung Luas Permukaan");
                        System.out.println("3. Kembali");
                        System.out.print("Pilihan Anda: ");
                        subPilihan = input.nextInt();

                        switch (subPilihan) {
                            case 1:
                                clearScreen.clear();
                                System.out.println("Volume Silinder: " + silinder.hitungVolumeSilinder());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 2:
                                clearScreen.clear();
                                System.out
                                        .println("Luas Permukaan Silinder: " + silinder.hitungLuasPermukaanSilinder());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 3:
                                clearScreen.clear();
                                break;
                            default:
                                System.out.println("Silakan pilih angka 1-3.");
                                continue;
                        }
                        if (subPilihan == 3)
                            break;
                    }
                    break;

                case 4: // Bola
                    while (true) {
                        clearScreen.clear();
                        System.out.print("Masukkan jari-jari: ");
                        double jariJari = input.nextDouble();
                        Calculation bola = new Calculation(jariJari);

                        System.out.println("1. Hitung Volume");
                        System.out.println("2. Hitung Luas Permukaan");
                        System.out.println("3. Kembali");
                        System.out.print("Pilihan Anda: ");
                        subPilihan = input.nextInt();

                        switch (subPilihan) {
                            case 1:
                                clearScreen.clear();
                                System.out.println("Volume Bola: " + bola.hitungVolumeBola());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 2:
                                clearScreen.clear();
                                System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaanBola());
                                System.out.println("Tekan enter untuk melanjutkan...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 3:
                                clearScreen.clear();
                                break;
                            default:
                                System.out.println("Silakan pilih angka 1-3.");
                                continue;
                        }
                        if (subPilihan == 3)
                            break;
                    }
                    break;

                case 5:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan kalkulator. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1 sampai 5.");
            }
        }

        input.close();
    }
}
