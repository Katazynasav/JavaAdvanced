package Inharitance.Example1;

public class Vehicle {
    private int maxSpeed;
    String licensePlate;

    public Vehicle(int maxSpeed){
        this.maxSpeed =maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
