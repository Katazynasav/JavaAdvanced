package SOLID;
//Open - Closed principle.

//Classes should be open for extension,but closed for modification.
//So we will not break current functionality.
public class Car extends Vehicle implements VehicleSpecs {
    private int numberOfDoors;
    @Override
    public void soundHorn() {
        super.soundHorn();
        System.out.println("Beep beep with music");
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void ride() {
        System.out.println("Wroooom");
    }
    @Override
    public void makeSound() {
        System.out.println("brrrrrr");
    }
}
