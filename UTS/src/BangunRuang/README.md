# Kalkulator Bangun Ruang 🧮
## Deskripsi 📖
Kalkulator Bangun Ruang adalah sebuah program sederhana yang digunakan untuk menghitung volume dan luas permukaan dari berbagai bangun ruang tiga dimensi seperti:
- Kubus
- Balok
- Bola
- Silinder ( Tabung )

Pengguna cukup memilih jenis bangun ruang, lalu memasukkan nilai-nilai seperti panjang, lebar, tinggi, atau jari-jari, dan program akan menampilkan hasil perhitungannya.
## 📁 Struktur Folder
```bash
BangunRuang/
├── Calculation.java
├── Main.java
└── README.md
```
### 1. Calculation.java

Berfungsi sebagai kelas inti perhitungan, yang berisi metode-metode untuk menghitung volume dan luas permukaan dari berbagai bangun ruang seperti:

hitungLuasPermukaanBalok

hitungVolumeBalok

dan lain-lain

Setiap metode menerima parameter yang sesuai (misal: sisi, panjang, lebar, tinggi, atau jari-jari) dan mengembalikan hasil perhitungan. Dengan memisahkan logika perhitungan di file ini, kode menjadi lebih rapi dan mudah untuk diuji.

### 2. Main.java
File ini merupakan titik masuk utama program. Di sini, pengguna akan:
- Melihat menu pilihan bangun ruang.
- Memasukkan data yang diperlukan (misal: panjang, lebar, tinggi, jari-jari).
- Memilih ingin menghitung volume atau luas permukaan.
- Melihat hasil perhitungan yang diambil dari metode di `Calculation.java`.

Program berjalan secara interaktif di terminal/console, sehingga mudah digunakan oleh siapa saja.

---

## Contoh Output

```
Selamat Datang di Kalkulator Bangun Ruang

=== Menu Utama ===
1. Kubus
2. Balok
3. Silinder
4. Bola
5. Keluar
Pilihan Anda: 1
Masukkan panjang sisi: 5
1. Hitung Volume
2. Hitung Luas Permukaan
Pilihan Anda: 1
Volume Kubus: 125.0
```

---
### 📄 Penjelasan Baris per Baris Main.java
```
package BangunRuang; 
```
 Menyatakan bahwa file ini berada dalam package BangunRuang

 ```
import java.util.Scanner;
```
 Mengimpor kelas Scanner dari paket java.util untuk membaca input dari pengguna.

```
public class Main {}
```
Mendeklarasikan kelas Main sebagai kelas publik. Kelas ini adalah titik masuk utama program.

```
public static void main(String[] args) {}
```
merupakan metode utama yang akan dieksekusi saat program dijalankan. Ini adalah titik awal eksekusi program Java.

```
Scanner input = new Scanner(System.in);
```
Membuat objek input dari kelas Scanner untuk membaca input dari pengguna.


## 👀Menampilkan Menu
```
System.out.println("Selamat Datang di Kalkulator Bangun Ruang");
System.out.println("\n=== Menu Utama ===");
System.out.println("1. Kubus");
System.out.println("2. Balok");
System.out.println("3. Silinder");
System.out.println("4. Bola");
System.out.println("5. Keluar");
```
Menampilkan menu utama kepada pengguna dengan pilihan bangun ruang yang tersedia.

```
System.out.print("Pilihan Anda: ");
int pilihan = scanner.nextInt();
```
Membaca pilihan pengguna dari input konsol dan menyimpannya dalam variabel pilihan.
```
int subPilihan;
```
Mendeklarasikan variabel subPilihan untuk menyimpan pilihan sub-menu (volume atau luas permukaan) yang akan ditampilkan setelah pengguna memilih bangun ruang.



## 🔁 Struktur Switch-case: Pilihan Bangun Ruang
# 1️⃣ Case 1 - Kubus
```
case 1:
    System.out.println("=== Kubus ===");
    System.out.print("Masukkan panjang sisi: ");
    double sisi = scanner.nextDouble();
    System.out.println("1. Hitung Volume");
    System.out.println("2. Hitung Luas Permukaan");
    System.out.print("Pilihan Anda: ");
    subPilihan = scanner.nextInt();
```
Mendeklarasikan case 1 untuk Kubus. Menampilkan dan meminta input panjang sisi kubus dari pengguna. Menampilkan pilihan untuk menghitung volume atau luas permukaan.

```
if (subPilihan == 1) {
                    System.out.println("Volume Kubus: " + kubus.hitungVolumeKubus());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus());
                }
```
kondisi untuk menghitung volume atau luas permukaan kubus berdasarkan pilihan pengguna. Memanggil metode yang sesuai dari objek kubus dan menampilkan hasilnya.
```
