package Interface.Example1;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,6);
        System.out.println("Rectangle area: " + Math.round(rectangle.getArea()));
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle format: " + rectangle.getFormat());
        rectangle.printInfo();
        System.out.println("======================");

        Circle circle = new Circle(10);
        System.out.println("Circle area: " + Math.round(circle.getArea()));
        System.out.println("Circle perimeter: " + Math.round(circle.getPerimeter()));//Math.round - apvalinimas
        System.out.println("Circle format: " + circle.getFormat());
        circle.printInfo();
        System.out.println("=====================");

        Triangle triangle = new Triangle(2,3);
        System.out.println("Triangle area: " + Math.round(triangle.getArea()));
        System.out.println("Triangle perimeter: " + Math.round(triangle.getPerimeter()));
        System.out.println("Triangle format: " + triangle.getFormat());
        triangle.printInfo();

    }
}