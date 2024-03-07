package time;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MonthDaysCalculatorTest {

    @Test(dataProvider = "validDays", dataProviderClass = MonthProvider.class)
    public void testName(int days, String[] expected) {
        String[] actual = MonthDaysCalculator.getMonthsByDays(days);

        Assert.assertEquals(expected, actual);
    }
}
