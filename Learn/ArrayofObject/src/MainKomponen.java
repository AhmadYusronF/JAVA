
import java.util.ArrayList;
import java.util.List;

public class MainKomponen {
    List<Komponen> listData;

    public static void main(String[] args) {
        new MainKomponen().tambahData();

    }

    private void tambahData() {
        listData = new ArrayList<Komponen>();
        listData.add(new Komponen("Mawus Platinum", 690));
        listData.add(new Komponen("Mawus Silver", 690));
        listData.add(new Komponen("Mawus Gold", 690));
        listData.add(new Komponen("Mawus Bronze", 690));
        listData.add(new Komponen("Mawus Cardboard", 690));
        listData.add(new Komponen("Mawus Halucination", 690));

        for (int i = 0; i < listData.size(); i++) {
            System.out.println(listData.get(i).namaKomponen + " Harganya " + listData.get(i).harga);

        }
    }

}
