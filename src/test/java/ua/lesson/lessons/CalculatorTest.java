package ua.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Home-PC on 11.02.2017.
 */
public class CalculatorTest {
    @Test

    public void add() throws Exception {

        Calculator calculator = new Calculator();

        calculator.add(1,1);

        assertEquals(2,calculator.getresult());

    }  

}