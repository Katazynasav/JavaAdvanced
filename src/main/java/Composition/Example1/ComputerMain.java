package Composition.Example1;

public class ComputerMain {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setBrand("Samsung");
        monitor.setDisplaySize(17);
        monitor.setMonitorPrice(500);

        Mouse mouse = new Mouse();
        mouse.setButtonCount(3);
        mouse.setOptical(true);
        mouse.setMousePrice(150);

        ComputerSet computerSet = new ComputerSet();
        computerSet.setMonitor(monitor);
        computerSet.setMouse(mouse);
        computerSet.setTotalPrice();
        System.out.println(computerSet.getTotalPrice());

        System.out.println("Computer's monitor brand is : " + computerSet.getMonitor().getBrand() );
        System.out.println("Monitor's display size : " + computerSet.getMonitor().getDisplaySize());
        String suffix = computerSet.getMouse().isOptical() ? "" : "NOT ";
        System.out.println("Mouse is " + suffix + "optical");
        System.out.println(computerSet);
}
}
