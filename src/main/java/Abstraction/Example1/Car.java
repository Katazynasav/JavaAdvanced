package Abstraction.Example1;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public void move() {
        System.out.println("Lengvoji masina vaziuoja... ");
    }
}
