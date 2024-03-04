package lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.sub(8,4));
    }

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(9, calculator.mul(3,3));
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.div(10,5));
    }
}
