
public class Encapsulation {
    public String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setMakanan("Sapi Terbang Istimewa");
        encapsulation.setMakanan("Ayam Bergoyang Luar Biasa");
        encapsulation.setMinuman("Susu MilikKu");
        encapsulation.setMinuman("Susu");
        System.out.println(encapsulation.getMakanan() + " dan " + encapsulation.getMinuman());
    }
}
