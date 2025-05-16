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

Mengimpor kelas input dari paket java.util untuk membaca input dari pengguna.

```
public class Main {}
```

Mendeklarasikan kelas Main sebagai kelas publik. Kelas ini adalah titik masuk utama program.

```
public static void main(String[] args) {}
```

merupakan metode utama yang akan dieksekusi saat program dijalankan. Ini adalah titik awal eksekusi program Java.

```
input input = new input(System.in);
```

Membuat objek input dari kelas input untuk membaca input dari pengguna.

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
int pilihan = input.nextInt();
```

Membaca pilihan pengguna dari input konsol dan menyimpannya dalam variabel pilihan.

```
int subPilihan;
```

Mendeklarasikan variabel subPilihan untuk menyimpan pilihan sub-menu (volume atau luas permukaan) yang akan ditampilkan setelah pengguna memilih bangun ruang.

## 🔁 Struktur Switch-case: Pilihan Bangun Ruang

# 1️⃣ Case 1 - Kubus

mendeklarasikan case 1 untuk Kubus.

```
    System.out.println("=== Kubus ===");
    System.out.print("Masukkan panjang sisi: ");
    int sisi = input.nextInt();
```

Menampilkan dan meminta input panjang sisi kubus dari pengguna.

```
Calculation kubus = new Calculation(sisi);
```

Membuat objek kubus dari kelas Calculation dengan parameter sisi yang dimasukkan oleh pengguna. Ini akan digunakan untuk menghitung volume dan luas permukaan kubus.

```
    System.out.println("1. Hitung Volume");
    System.out.println("2. Hitung Luas Permukaan");
    System.out.print("Pilihan Anda: ");
    subPilihan = input.nextInt();
```

Menampilkan pilihan untuk menghitung volume atau luas permukaan kubus. Pengguna diminta untuk memilih salah satu dari dua opsi ini.

```
if (subPilihan == 1) {
                    System.out.println("Volume Kubus: " + kubus.hitungVolumeKubus());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaanKubus());
                }
```

kondisi untuk menghitung volume atau luas permukaan kubus berdasarkan pilihan pengguna. Memanggil metode yang sesuai dari objek kubus dan menampilkan hasilnya.

# 2️⃣ Case 2 - Balok

mendeklarasikan case 2 untuk Balok.

```
    System.out.println("=== Balok ===");
    System.out.print("Masukkan panjang: ");
    double panjang = input.nextDouble();
    System.out.print("Masukkan lebar: ");
    double lebar = input.nextDouble();
    System.out.print("Masukkan tinggi: ");
    double tinggi = input.nextDouble();
```

Menampilkan dan meminta input panjang, lebar, dan tinggi balok dari pengguna.

```
    Calculation balok = new Calculation(panjang, lebar, tinggi);
```

Membuat objek balok dari kelas Calculation dengan parameter panjang, lebar, dan tinggi yang dimasukkan oleh pengguna. Ini akan digunakan untuk menghitung volume dan luas permukaan balok.

```
    System.out.println("1. Hitung Volume");
    System.out.println("2. Hitung Luas Permukaan");
    System.out.print("Pilihan Anda: ");
    subPilihan = input.nextInt();
```

Menampilkan pilihan untuk menghitung volume atau luas permukaan balok. Pengguna diminta untuk memilih salah satu dari dua opsi ini.

```
if (subPilihan == 1) {
                    System.out.println("Volume Balok: " + balok.hitungVolumeBalok());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaanBalok());
                }
```

kondisi untuk menghitung volume atau luas permukaan balok berdasarkan pilihan pengguna. Memanggil metode yang sesuai dari objek balok dan menampilkan hasilnya.

# 3️⃣ Case 3 - Silinder

mendeklarasikan case 3 untuk Silinder.

```
    System.out.println("=== Silinder ===");
    System.out.print("Masukkan jari-jari: ");
    double jariJari = input.nextDouble();
    System.out.print("Masukkan tinggi: ");
    double tinggiSilinder = input.nextDouble();
```

Menampilkan dan meminta input jari-jari dan tinggi silinder dari pengguna.

```
    Calculation silinder = new Calculation(jariJari, tinggiSilinder);
```

Membuat objek silinder dari kelas Calculation dengan parameter jari-jari dan tinggi yang dimasukkan oleh pengguna. Ini akan digunakan untuk menghitung volume dan luas permukaan silinder.

```
    System.out.println("1. Hitung Volume");
    System.out.println("2. Hitung Luas Permukaan");
    System.out.print("Pilihan Anda: ");
    subPilihan = input.nextInt();
```

Menampilkan pilihan untuk menghitung volume atau luas permukaan silinder. Pengguna diminta untuk memilih salah satu dari dua opsi ini.

```
if (subPilihan == 1) {
                    System.out.println("Volume Silinder: ");
                    System.out.printf("%.2f cm%n", silinder.hitungVolumeSilinder());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan Silinder: ");
                    System.out.printf("%.2f cm%n", silinder.hitungLuasPermukaanSilinder());
                }
```
kondisi untuk menghitung volume atau luas permukaan silinder berdasarkan pilihan pengguna. Memanggil metode yang sesuai dari objek silinder dan menampilkan hasilnya.
Menampilkan hasil dengan format dua angka desimal.



# 4️⃣ Case 4 - Bola

mendeklarasikan case 4 untuk Bola.

```
    System.out.println("=== Bola ===");
    System.out.print("Masukkan jari-jari: ");
    double jariJariBola = input.nextDouble();
```

Menampilkan dan meminta input jari-jari bola dari pengguna.

```
    Calculation bola = new Calculation(jariJariBola);
```

Membuat objek bola dari kelas Calculation dengan parameter jari-jari yang dimasukkan oleh pengguna. Ini akan digunakan untuk menghitung volume dan luas permukaan bola.

```
    System.out.println("1. Hitung Volume");
    System.out.println("2. Hitung Luas Permukaan");
    System.out.print("Pilihan Anda: ");
    subPilihan = input.nextInt();
```

Menampilkan pilihan untuk menghitung volume atau luas permukaan bola. Pengguna diminta untuk memilih salah satu dari dua opsi ini.

```
if (subPilihan == 1) {
                    System.out.println("Volume bola: ");
                    System.out.printf("%.2f cm%n", bola.hitungVolumeBola());
                } else if (subPilihan == 2) {
                    System.out.println("Luas Permukaan bola: ");
                    System.out.printf("%.2f cm%n", bola.hitungLuasPermukaanBola());
                }
```
kondisi untuk menghitung volume atau luas permukaan bola berdasarkan pilihan pengguna. Memanggil metode yang sesuai dari objek bola dan menampilkan hasilnya.
Menampilkan hasil dengan format dua angka desimal.


# 5️⃣ Case 5 - Keluar

mendeklarasikan case 5 untuk Keluar.

```
    System.out.println("Terima kasih telah menggunakan Kalkulator Bangun Ruang!");
    System.exit(0);
```

Menampilkan pesan terima kasih kepada pengguna dan menghentikan eksekusi program.

```
default:
    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
```

Menangani kasus di mana pengguna memasukkan pilihan yang tidak valid. Menampilkan pesan kesalahan dan meminta pengguna untuk mencoba lagi.

### 📄 Penjelasan Baris per Baris Calculation.java

```
package BangunRuang;
```

Menyatakan bahwa file ini berada dalam package BangunRuang

```
int sisi;
double panjang, lebar, tinggi, jariJari;
```

Mendeklarasikan variabel untuk menyimpan nilai sisi, panjang, lebar, tinggi, dan jari-jari yang akan digunakan dalam perhitungan.

```
public Calculation(int sisi) {
    this.sisi = sisi;
}
```

Konstruktor untuk kelas Calculation yang menerima parameter sisi. Ini digunakan untuk menghitung volume dan luas permukaan kubus.

```
public Calculation(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
}
```

Konstruktor untuk kelas Calculation yang menerima parameter panjang, lebar, dan tinggi. Ini digunakan untuk menghitung volume dan luas permukaan balok.

```
public Calculation(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
}
```

Konstruktor untuk kelas Calculation yang menerima parameter jari-jari dan tinggi. Ini digunakan untuk menghitung volume dan luas permukaan silinder.

```
public Calculation(double jariJari) {
    this.jariJari = jariJari;
}
```

Konstruktor untuk kelas Calculation yang menerima parameter jari-jari. Ini digunakan untuk menghitung volume dan luas permukaan bola.

```
public double hitungVolumeKubus() {
    return Math.pow(sisi, 3);
}
```

Metode untuk menghitung volume kubus dengan rumus sisi^3. Menggunakan fungsi Math.pow untuk menghitung pangkat tiga dari sisi.

```
public double hitungLuasPermukaanKubus() {
    return 6 * Math.pow(sisi, 2);
}
```

Metode untuk menghitung luas permukaan kubus dengan rumus 6 \* sisi^2. Menggunakan fungsi Math.pow untuk menghitung pangkat dua dari sisi.

```
public double hitungVolumeBalok() {
    return panjang * lebar * tinggi;
}
```

Metode untuk menghitung volume balok dengan rumus panjang _ lebar _ tinggi.

```
public double hitungLuasPermukaanBalok() {
    return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
}
```

Metode untuk menghitung luas permukaan balok dengan rumus 2 _ (panjang _ lebar + panjang _ tinggi + lebar _ tinggi).

```
public double hitungVolumeSilinder() {
    return Math.PI * Math.pow(jariJari, 2) * tinggi;
}
```

Metode untuk menghitung volume silinder dengan rumus π _ jari-jari^2 _ tinggi. Menggunakan fungsi Math.PI untuk mendapatkan nilai π dan Math.pow untuk menghitung pangkat dua dari jari-jari.

```
public double hitungLuasPermukaanSilinder() {
    return 2 * Math.PI * jariJari * (jariJari + tinggi);
}
```

Metode untuk menghitung luas permukaan silinder dengan rumus 2 _ π _ jari-jari \* (jari-jari + tinggi). Menggunakan fungsi Math.PI untuk mendapatkan nilai π.

```
public double hitungVolumeBola() {
    return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
}
```

Metode untuk menghitung volume bola dengan rumus (4/3) _ π _ jari-jari^3. Menggunakan fungsi Math.PI untuk mendapatkan nilai π dan Math.pow untuk menghitung pangkat tiga dari jari-jari.

```
public double hitungLuasPermukaanBola() {
    return 4.0 * Math.PI * Math.pow(jariJari, 2);
}
```

Metode untuk menghitung luas permukaan bola dengan rumus 4 _ π _ jari-jari^2. Menggunakan fungsi Math.PI untuk mendapatkan nilai π dan Math.pow untuk menghitung pangkat dua dari jari-jari.
