package Inharitance.Example2;

public class Cat extends Animal {
    private int tailLength;
    public Cat(String name, int weight) {
        super(name, weight);
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
}
