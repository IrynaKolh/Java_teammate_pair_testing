package time;

import org.testng.annotations.DataProvider;

public class MonthProvider {
    @DataProvider(name = "validDays")
    public Object[][] daysProvider() {
        return new Object[][]{
                {28, new String[]{"February"}},
                {29, new String[]{"February"}},
                {30, new String[]{"April", "June", "September", "November" }},
                {31, new String[]{"January", "March", "May", "July", "August", "October", "December" }},
                {-1, new String[]{}},
                {32, new String[]{}},
//                {27, new String[]{}},
//                {1, new String[]{}},
//                {0, new String[]{}},
//                {null, new String[]{}},
        };
    }
}
