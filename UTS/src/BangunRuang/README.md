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
- Calculation.java

Berfungsi sebagai kelas inti perhitungan, yang berisi metode-metode untuk menghitung volume dan luas permukaan dari berbagai bangun ruang seperti:

hitungLuasPermukaanBalok

hitungVolumeBalok

dan lain-lain

Kelas ini menerima input dari pengguna (melalui kelas Main) dan mengembalikan hasil perhitungan yang akurat. Semua logika matematika ditempatkan di sini untuk menjaga keterpisahan antara logika perhitungang dan UI menu.

- Main.java

Merupakan entry point atau titik masuk utama dari program.
Di sini pengguna akan berinteraksi dengan program, memilih jenis bangun ruang, memasukkan input (seperti panjang, jari-jari, tinggi, dsb), dan menerima hasil perhitungan yang diperoleh dari pemanggilan metode di `Calculation.java`.



## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
