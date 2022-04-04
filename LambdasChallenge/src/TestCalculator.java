import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCalculator {
    
    @Test
    public void add() {
        assertEquals(Calculator.add(2, 45), 2 + 45);
    }

    @Test
    public void sub() {
        assertEquals(Calculator.sub(2, 45), 2 - 45);
    }

    @Test
    public void isOdd() {
        assertTrue(Calculator.isOdd(5) == false);
    }

    @Test
    public void isPrime() {
        assertTrue(Calculator.isPrime(6) == false);
    }

    @Test
    public void getFactorial() {
        assertEquals(Calculator.getFactorial(3), 6);
    }
}
