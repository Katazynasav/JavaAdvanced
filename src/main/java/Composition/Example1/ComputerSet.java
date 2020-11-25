package Composition.Example1;

public class ComputerSet {
    private int totalPrice;
    private Monitor monitor;
    private Mouse mouse;
    private Printer printer;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = calculateTotalPrice(monitor.getMonitorPrice(),mouse.getMousePrice());
    }
    public int calculateTotalPrice(int monitorPrice,int mousePrice){
        return monitorPrice + mousePrice;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }


    @Override
    public String toString() {
        return "ComputerSet{" +
                "Total price " + totalPrice +
                ", monitor = " + monitor +
                ", mouse = " + mouse +
                ",printer = " + printer +
                '}';
    }
}
