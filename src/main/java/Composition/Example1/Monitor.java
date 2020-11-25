package Composition.Example1;

public class Monitor {
    private int monitorPrice;
    private int displaySize;
    private String brand;

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMonitorPrice() {
        return monitorPrice;
    }

    public void setMonitorPrice(int monitorPrice) {
        this.monitorPrice = monitorPrice;
    }

    @Override
    public String toString() {
        return "Monitor {" +
                "monitorPrice = " + monitorPrice +
                ", displaySize = " + displaySize +
                ", brand ='" + brand + '\'' +
                '}';
    }
}
