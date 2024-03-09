package median;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MedianTest {

    private Median median;
    @BeforeClass
    public void beforeClass() {
        median = new Median();
    }

    @Test
    public void testMedianHN() {
    }

    @Test(dataProvider = "validNumberArrayProvider",
            dataProviderClass = DataNumbersProvider.class)
    public void testFindMedianValidNumberArrayProvider(int[] input, double expected) {
        double actual = median.getMedian(input);
        assertEquals(expected, actual);
    }
    @Test(dataProvider = "validNumberArrayProvider",
            dataProviderClass = DataNumbersProvider.class)
    public void testFindMedianValidNumberArrayProviderQuickSelect(int[] input, double expected) {
        double actual = median.getMedian(input);
        assertEquals(expected, actual);
    }
    @Test(dataProvider = "invalidNumberArrayProvider",
            dataProviderClass = DataNumbersProvider.class)
    public void testCalculateMedianWithInvalidInput(int[] numbers, double expected) {
        double actual = median.getMedian(numbers);
        assertEquals(expected, actual);
    }

    @Test(dataProvider = "singleElementArrayProvider",
            dataProviderClass = DataNumbersProvider.class)
    public void testFindMedianValidNumberArrayProviderWithSingleElementArrayProvider(int[] input, double expected) {
        double actual = median.getMedian(input);
        assertEquals(actual, expected);
    }
}
