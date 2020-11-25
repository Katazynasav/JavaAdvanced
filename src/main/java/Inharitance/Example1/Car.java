package Inharitance.Example1;
//Car IS-A vehicle = relationship

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }
    public void makeCarSoun(){
        System.out.println("Car making sound");
    }

}
