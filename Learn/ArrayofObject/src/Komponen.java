
public class Komponen {

    public Komponen(String namaKomponen, int harga) {
        this.namaKomponen = namaKomponen;
        this.harga = harga;
    }

    String namaKomponen;
    int harga;

    public String getNamaKomponen() {
        return namaKomponen;
    }

    public void setNamaKomponen(String namaKomponen) {
        this.namaKomponen = namaKomponen;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
