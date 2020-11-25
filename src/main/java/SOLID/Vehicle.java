package SOLID;

import java.time.LocalDate;

// SOLID -single Responsibility Principle
public class Vehicle {
    private String brand;
    private String model;
    private String licensePlate;
    private LocalDate lastTechnikine;
    private LocalDate now;

    public void soundHorn(){
        System.out.println("Beep Beep");
    }

    public boolean isTechnikneOver() {
        if (true) {
            return true;
        }
        return false;
    }
    // Create new class for this to test if car is used CarInspector.java
    public void checkIfCarIsUsed(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


}
