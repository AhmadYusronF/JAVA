package BangunRuang;

public class Calculation {
    // Kubus
    // Volume = sisi^3
    // Luas Permukaan = 6 * sisi^2

    // Balok
    // Volume = panjang * lebar * tinggi
    // Luas Permukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
    
    // Silinder
    // Volume = π * jariJari^2 * tinggi
    // Luas Permukaan = 2 * π * jariJari * (jariJari + tinggi)
    
    // Bola
    // Volume = (4/3) * π * jariJari^3
    // Luas Permukaan = 4 * π * jariJari^2
    
    int sisi;
    double panjang, lebar, tinggi, jariJari;
    
    // Konstruktor untuk kubus (menggunakan sisi)
    public Calculation(int sisi) {
        this.sisi = sisi;
    }
    // Konstruktor untuk balok (menggunakan panjang, lebar, dan tinggi)
    public Calculation(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    // Konstruktor untuk silinder (menggunakan tinggi dan jari-jari)
    public Calculation(double tinggi, double jariJari) {
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }
    // Konstruktor untuk bola (menggunakan jari-jari)
    public Calculation(double jariJari) {
        this.jariJari = jariJari;
    }

    // Volume Kubus
    public double hitungVolumeKubus() {
        return Math.pow(sisi, 3);
    }

    // Luas Permukaan Kubus
    public double hitungLuasPermukaanKubus() {
        return 6.0 * Math.pow(sisi, 2);
    }

    // Volume Balok
    public double hitungVolumeBalok() {
        return panjang * lebar * tinggi;
    }

    // Luas Permukaan Balok
    public double hitungLuasPermukaanBalok() {
        return 2.0 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Volume Silinder
    public double hitungVolumeSilinder() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    // Luas Permukaan Silinder
    public double hitungLuasPermukaanSilinder() {
        return 2.0 * Math.PI * jariJari * (jariJari + tinggi);
    }

    // Volume Bola
    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    // Luas Permukaan Bola
    public double hitungLuasPermukaanBola() {
        return 4.0 * Math.PI * Math.pow(jariJari, 2);
    }
}
