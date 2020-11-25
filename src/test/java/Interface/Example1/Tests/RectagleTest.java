package Interface.Example1.Tests;

import Interface.Example1.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectagleTest {

    @Test
    public void getArea() {
        //given
        Rectangle rectangle = new Rectangle(4, 5);
        //when
        double actual = rectangle.getArea();
        //then
        Assert.assertEquals(20,actual,0);

    }
    @Test
    public void getPerimeter(){
        //given
        Rectangle rectangle = new Rectangle(10, 6);
        //when
        double actual = rectangle.getPerimeter();
        //then
        Assert.assertEquals(32,actual,0);


    }
}
