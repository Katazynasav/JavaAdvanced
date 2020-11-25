package Interface.Example1.Tests;

import Interface.Example1.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void getArea(){
        //given
        Circle circle = new Circle(10);
        //when
        double actual = circle.getArea();
        //then
        Assert.assertEquals(314,actual,0.2);
    }
    @Test
    public void getPerimeter(){
        //given
        Circle circle = new Circle(10);
        //when
        double actual = circle.getPerimeter();
        //then
        Assert.assertEquals(63,actual,0.2);


    }
}
