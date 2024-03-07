package time;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class MonthDaysCalculatorTest {

    @Test(dataProvider = "validDays", dataProviderClass = MonthProvider.class)
    public void testName(int days, String[] expected) {
        String[] actual = MonthDaysCalculator.getMonthsByDays(days);

        Assert.assertEquals(expected, actual);
    }

    @Test(dataProvider = "enumDaysProvider", dataProviderClass = MonthProvider.class)
    public void testGetMonthsByDays(int days, String[] expected) {
        String[] result = MonthDaysCalculator.getMonthsByDays(days);

        assertArrayEquals(result, expected);
    }

    @Test(dataProvider = "invalidDaysProvider", dataProviderClass = MonthProvider.class)
    public void testGetMonthsByInvalidDays(int days) {
        String[] result = MonthDaysCalculator.getMonthsByDays(days);

        assertEquals(result.length, 0);
    }
}
