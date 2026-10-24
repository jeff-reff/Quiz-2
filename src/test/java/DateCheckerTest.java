import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST",
                                                             "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHas31Days(DateChecker.Month month){
        assertFalse(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = "FEBRUARY")
    public void testIsMonthFebruary(DateChecker.Month month){
        assertFalse(dateChecker.has31Days(month));
    }

    @Test
    public void testIsNullInput(DateChecker.Month month){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateChecker.has31Days(null));
        String expectedMessage = "Month can NOT be null";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }


}
