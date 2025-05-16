import java.util.Scanner;

public class MainLaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];
        for (int i = 0; i < laptops.length; i++) {
            System.out.print("Input model of the laptop: ");
            String brand = input.nextLine();

            laptops[i] = new Laptop();
            laptops[i].setBrand(brand);
        }
        for(int i=0;i<laptops.length;i++){
                       System.out.println(laptops[i].getBrand());
                   }
        input.close();
    }
}
