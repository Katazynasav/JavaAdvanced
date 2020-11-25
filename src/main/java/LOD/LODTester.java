package LOD;
//Low of Dementer:
public class LODTester {
    public static void main(String[] args) {
        ComputerSet computerSet = new ComputerSet();
        Computer computer = new Computer();
        computer.setBrand("TOSHIBA");
        computerSet.setComputer(computer);
        System.out.println(computerSet.getComputerBrand(constructName()));
        System.out.println(computerSet);
    }
    private static String constructName() {
        return "NBLALALS";
    }
}
class ComputerSet {
    private Computer computer;
    public String getComputerBrand(String name) {
        if(computer != null) {
            return computer.getBrand();
        } else {
            return "N/A";
        }
    }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public void doSomething() {
        doSomethingElse();
    }
    private void doSomethingElse() {
    }
}
class Computer {
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}

