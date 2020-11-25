package Composition.Example1;

public class Printer {
    private String Brand;
    private int printerPrice;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrinterPrice() {
        return printerPrice;
    }

    public void setPrinterPrice(int printerPrice) {
        this.printerPrice = printerPrice;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "Brand='" + Brand + '\'' +
                ", printerPrice=" + printerPrice +
                '}';
    }
}
