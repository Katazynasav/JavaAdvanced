package Interface.Example1.Tests;

import Interface.Example1.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void getArea(){
        //given
        Triangle triangle = new Triangle(2,3);
        //when
        double actual = triangle.getArea();
        //then
        Assert.assertEquals(3,actual,0);
    }
    @Test
    public void getPerimeter(){
        //given
        Triangle triangle = new Triangle(3,4);
        //when
        double actual = triangle.getPerimeter();
        //then
        Assert.assertEquals(12,actual,0);
    }
}
