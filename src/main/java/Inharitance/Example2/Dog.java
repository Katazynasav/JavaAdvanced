package Inharitance.Example2;

public class Dog extends Animal {

    private String color;

    public Dog(String name, int weight,String color) {
        super(name, weight);
    }

    public void makeDogSound (){
        System.out.println("bark bark bark");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
