package Inharitance.Example1;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Vehicle car = new Car(220);
        car.setLicensePlate("HBS266");

        Vehicle vehicle = new Vehicle(250);

        Vehicle truck = new Truck(90);
        truck.setLicensePlate("DFR452");

        System.out.println("Truck license plate is: " + truck.licensePlate  );

        List<Vehicle> listOfCars = new ArrayList<Vehicle>();
        listOfCars.add(car);
        listOfCars.add(truck);







    }
}
