package time;

import org.testng.annotations.Test;

public class MonthDaysCalculatorTest {

    @Test(dataProvider = "validDays", dataProviderClass = MonthProvider.class)
    public void testName(int days, String[] expected) {

    }
}
