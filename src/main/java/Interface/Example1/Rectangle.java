package Interface.Example1;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public String getFormat() {
        return Shape.format.toString();
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "length = " + length +
                ", width = " + width +
                '}';
    }
}
