package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calc.add(50, 5);
        assertEquals(55, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(50, 5);
        assertEquals(45, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }
}