

public class Ovaloado {
    // global variable
    double hasil;

    public Ovaloado(int i) {
        System.out.println("nilai awal: " + i);
    }

    public static void main(String[] args) {
        Ovaloado ovaloado = new Ovaloado(6);
        Ovaloado ovaloadoNew = new Ovaloado(4);
        Ovaloado ovaloadov2 = new Ovaloado(5);
        ovaloado.exponential();
        ovaloado.showHasil();

        ovaloadoNew.exponential(4, "5");
        ovaloadoNew.showHasil();

        ovaloadov2.exponential(4);
        ovaloadov2.showHasil();
    }

    private void exponential(int inputX, String inputY) {
        double a = Double.parseDouble(inputY);
        hasil = Math.pow(inputX, a);
    }

    private void exponential(double inputX) {
        hasil = Math.pow(inputX, 2);
    }

    private void exponential() {
        // local variable
        double inputX = 5;
        hasil = Math.pow(inputX, 2);
    }

    private void showHasil() {
        System.out.println("Hasil Expontional: " + hasil);
    }

}
