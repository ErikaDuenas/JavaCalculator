package org.eduenas;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply(){
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivide(){
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void testDivideByZero(){
        try {
            calculator.divide(6, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}