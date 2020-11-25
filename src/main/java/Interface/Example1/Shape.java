package Interface.Example1;

public interface Shape {

    String color = "Red";
    int weight = 5;
    ShapeFormat format = ShapeFormat.TWO_DIMENTIONAL;


  //Should calculate area of the specific shape.

    double getArea();

    //Should calculate perimeter of specific shape.

    double getPerimeter();

    //returns format of teh shape

    String getFormat();

    //default method implementation
    default void printInfo(){
        System.out.println("Shape " + this);
    }

}
