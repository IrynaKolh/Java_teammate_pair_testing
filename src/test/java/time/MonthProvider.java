package time;

import org.testng.annotations.DataProvider;

import static time.MonthType.*;

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
                {27, new String[]{}},
                {1, new String[]{}},
                {0, new String[]{}},
                {Integer.MIN_VALUE, new String[]{}},
                {Integer.MAX_VALUE, new String[]{}}
        };
    }

    @DataProvider(name = "enumDaysProvider")
    public Object[][] enumDaysProvider() {
        return new Object[][] {
                {31, new String[] {
                        JANUARY.getName(), MARCH.getName(),
                        MAY.getName(), JULY.getName(),
                        AUGUST.getName(), OCTOBER.getName(),
                        DECEMBER.getName()}},
                {30, new String[] {
                        APRIL.getName(), JUNE.getName(),
                        SEPTEMBER.getName(), NOVEMBER.getName()}},
                {29, new String[] {FEBRUARY.getName()}},
                {28, new String[] {FEBRUARY.getName()}}
        };
    }

    @DataProvider(name = "invalidDaysProvider")
    public Object[][] invalidDaysProvider() {
        return new Object[][] {
                {-1},
                {0},
                {1},
                {27},
                {32},
                {100}
        };
    }
}
