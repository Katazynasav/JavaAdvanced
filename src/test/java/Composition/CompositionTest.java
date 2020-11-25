package Composition;

import Composition.Example1.ComputerSet;
import org.junit.Assert;
import org.junit.Test;


public class CompositionTest {
    @Test
    public void calculateTotalPrice(){
        //given
        ComputerSet computerSet = new ComputerSet();
        //when
        int actual = computerSet.calculateTotalPrice(100,50);
        int expected = 150;
        //then
        Assert.assertEquals(expected,actual);

    }
}
