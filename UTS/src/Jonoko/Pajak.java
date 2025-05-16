package Jonoko;

// Jika harga > Rp 4.000.000,00 maka PPN 1%
// Jika harga > Rp 4.500.000,00 sampai Rp 8.000.000,00 maka PPN 2%
// Jika harga > Rp 8.000.000,00 maka PPN 5%
public class Pajak {
    String vendor, tipe;
    int harga;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
