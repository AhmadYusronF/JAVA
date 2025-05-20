package Soal2;

public class Tax {
    String brand, type;
    int price;

    public Tax(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double calculateTax(int price) {
        if (price > 8000000) {
            return price * 0.05;
        } else if (price > 4500000) {
            return price * 0.02;
        } else if (price > 4000000) {
            return price * 0.01;
        } else {
            return 0;
        }

    }
}
