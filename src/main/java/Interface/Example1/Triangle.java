package Interface.Example1;

public class Triangle implements Shape {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b / 2;
    }

    public double getPerimeter() {
        return a + b + calculateDiagonal();
    }

    public String getFormat() {
        return Shape.format.toString();
    }

    public double calculateDiagonal(){
        return Math.sqrt(a * a + b * b );
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "a = " + a +
                ", b = " + b +
                '}';
    }
}
