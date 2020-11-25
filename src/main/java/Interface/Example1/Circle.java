package Interface.Example1;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Area formula - Pi R kvadratu

    public double getArea() {
        return Math.PI * Math.pow(radius,2); //w kwadracie
    }

    //Perimeter formula - 2PIr

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String getFormat() {
        return Shape.format.toString();
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                '}';
    }
}
