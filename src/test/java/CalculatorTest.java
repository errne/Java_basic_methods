import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        double sum = calc.add(9, 11);
        assertEquals(20, sum, 0.00001);
    }

    @Test
    public void canSubstract(){
        double sum = calc.substract(20, 11);
        assertEquals(9, sum, 0.00001);
    }
    @Test
    public void canMultiply(){
        double sum = calc.multiply(9, 9);
        assertEquals(81, sum, 0.00001);
    }
    @Test
    public void canDivide(){
        double sum = calc.divide(9, 3);
        assertEquals(3, sum, 0.00001);
    }
}
