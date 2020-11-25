package Inharitance.Example2;

public class Pomeranian extends Dog{
    private boolean fluffy = true;

    public Pomeranian(String name, int weight, String color) {
        super(name, weight, color);
    }
    public boolean isFluffy() {
        return fluffy;
    }
}
