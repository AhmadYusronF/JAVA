package BangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat objek input dari kelas Scanner untuk membaca input dari
                                                // pengguna
        // Menampilkan menu utama kalkulator bangun ruang menggunakan System.out.println
        // untuk mencetak teks ke konsol
        System.out.println("Selamat Datang di Kalkulator Bangun Ruang");
        System.out.println("\n=== Menu Utama ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Silinder");
        System.out.println("4. Bola");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt(); // membaca pilihan pengguna dari konsol
        int subPilihan;
        // Menggunakan switch-case untuk menentukan bangun ruang yang dipilih oleh
        // pengguna
        // Setiap case menangani perhitungan untuk bangun ruang yang berbeda
        switch (pilihan) {
            case 1: // Kubus
                System.out.println("=== Kubus ===");
                // Meminta pengguna untuk memasukkan panjang sisi kubus
                System.out.print("Masukkan panjang sisi: ");
                int sisi = input.nextInt();
                Calculation kubus = new Calculation(sisi); // Membuat objek kubus dari kelas Calculation untuk
                                                           // menghitung volume dan luas permukaan kubus dengan panjang
                                                           // sisi yang diberikan
                // Menampilkan menu sub pilihan untuk menghitung volume atau luas permukaan
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();
                // Menggunakan if-else untuk menentukan apakah pengguna ingin menghitung volume
                // atau luas permukaan kubus
                if (subPilihan == 1) {
                    System.out.println("Volume Kubus: " + kubus.hitungVolumeKubus());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus());
                }
                break;

            case 2: // Balok
                System.out.println("=== Balok ===");
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                Calculation balok = new Calculation(panjang, lebar, tinggi); // Membuat objek balok dari kelas
                                                                             // Calculation untuk menghitung volume dan
                                                                             // luas permukaan balok dengan panjang,
                                                                             // lebar, dan tinggi yang diberikan
                // Menampilkan menu sub pilihan untuk menghitung volume atau luas permukaan
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();

                // Menggunakan if-else untuk menentukan apakah pengguna ingin menghitung volume
                // atau luas permukaan balok
                if (subPilihan == 1) {
                    System.out.println("Volume Balok: " + balok.hitungVolumeBalok());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok());
                }
                break;

            case 3: // Silinder
                System.out.println("=== Silinder ===");
                System.out.print("Masukkan jari-jari: ");
                double jariJariSilinder = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSilinder = input.nextDouble();
                Calculation silinder = new Calculation(tinggiSilinder, jariJariSilinder); // Membuat objek silinder dari
                                                                                          // kelas Calculation untuk
                                                                                          // menghitung volume dan luas
                                                                                          // permukaan silinder dengan
                                                                                          // jari-jari dan tinggi yang
                                                                                          // diberikan
                // Menampilkan menu sub pilihan untuk menghitung volume atau luas permukaan
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                subPilihan = input.nextInt();
                // Menggunakan if-else untuk menentukan apakah pengguna ingin menghitung volume
                // atau luas permukaan silinder
                // Menggunakan metode hitungVolumeSilinder() dan hitungLuasPermukaanSilinder()
                // dari objek silinder
                if (subPilihan == 1) {
                    System.out.println("Volume Silinder: " + silinder.hitungVolumeSilinder());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Silinder: " + silinder.hitungLuasPermukaanSilinder());
                }
                break;

            case 4: // Bola
                System.out.println("=== Bola ===");
                System.out.print("Masukkan jari-jari: ");
                double jariJariBola = input.nextDouble();
                Calculation bola = new Calculation(jariJariBola);// Membuat objek bola dari kelas Calculation untuk
                                                                 // menghitung volume dan luas
                                                                 // permukaan bola dengan jari-jari
                                                                 // yang diberikan
                System.out.println("1. Hitung Volume");
                System.out.println("2. Hitung Luas Permukaan");
                System.out.print("Pilihan Anda: ");
                // Menggunakan if-else untuk menentukan apakah pengguna ingin menghitung volume
                // atau luas permukaan bola
                // Menggunakan metode hitungVolumeBola() dan hitungLuasPermukaanBola() dari
                // objek bola
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
            // Menggunakan default untuk menangani pilihan yang tidak valid
            // Jika pengguna memasukkan angka selain 1 sampai 5, maka program akan menampilkan pesan kesalahan
            default:
                System.out.println("Pilihan tidak valid. Masukkan angka 1 sampai 5.");
        }

        input.close();
    }
}
