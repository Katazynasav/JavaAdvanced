package Abstraction.Example1;

public abstract class Vehicle {
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void move();

    public void testHonr() {
        System.out.println("beep beep beep");
    }
}
