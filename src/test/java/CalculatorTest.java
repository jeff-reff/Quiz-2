import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {

        int expected = -1;
        int actual =2;
        assertEquals(expected, actual);
    }
}
