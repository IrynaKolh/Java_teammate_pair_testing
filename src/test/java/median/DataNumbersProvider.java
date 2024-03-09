package median;

import org.testng.annotations.DataProvider;

public class DataNumbersProvider {

    @DataProvider(name = "validNumberArrayProvider")
    public Object[][] validNumberArrayProvider() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4}, 2.5},
                {new int[]{-1, -2, -3, -4}, -2.5},
                {new int[]{1, 3, 5}, 3.0},
                {new int[]{5, 3, 2}, 3.0},
                {new int[]{1, 2, 3, 4, 5, 6}, 3.5},
                {new int[]{6, 5, 4, 3, 2, 1}, 3.5},
                {new int[]{3, 1, 4, 1, 5, 9}, 3.5},
                {new int[]{3, 1, 4, 1, 5}, 3.0},
                {new int[]{-1, -2, -3, -4, -5}, -3.0},
                {new int[]{2147483647, 2147483647, 2147483647, 2147483647}, 2147483647},
                {new int[]{2147483647, 2147483647, 2147483647}, 2147483647},
                {new int[]{2147483647}, 2147483647},
                {new int[]{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}, 11.0},
                {new int[]{1000000, 2000000, 3000001, 4000000, 5000000}, 3000001.0},
        };
    }

    @DataProvider(name = "invalidNumberArrayProvider")
    public Object[][] invalidNumberArrayProvider() {
        return new Object[][]{
                {null, 0x0.0000000000001P-1022},
                {new int[]{}, 0x80000000},
        };
    }

    @DataProvider(name = "singleElementArrayProvider")
    public Object[][] singleElementArrayProvider() {
        return new Object[][]{
                {new int[]{0}, 0.0},
                {new int[]{1}, 1.0},
                {new int[]{2}, 2.0},
                {new int[]{5}, 5.0},
                {new int[]{-5}, -5.0},
        };
    }
}
