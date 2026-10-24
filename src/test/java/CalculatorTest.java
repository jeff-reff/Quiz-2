import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        //positive test
        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);

        //negative test
        expected = -3;
        actual = calculator.sum(-1, -2);
        assertEquals(expected, actual);

        //zero test
        expected = 4;
        actual = calculator.sum(4, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        //negative case
        int expected = 1;
        int actual = calculator.subtract(-1, -2);
        assertEquals(expected, actual);

        //zero case
        expected = 2;
        actual = calculator.subtract(2, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        //positive test
        int expected = 2;
        int actual = calculator.multiply(1, 2);
        assertEquals(expected, actual);

        //zero test
        expected = 0;
        actual = calculator.multiply(4, 0);
        assertEquals(expected, actual);

        //negative test
        expected = -4;
        actual = calculator.multiply(2, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 2;
        int actual = calculator.divide(2, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven(){
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void testIsOdd(){
        boolean actual = calculator.isEven(3);
        assertFalse(actual);
    }
}
