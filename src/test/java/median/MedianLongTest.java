package median;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MedianLongTest {
    @Test
    public void testMedianOddHP() {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        double expectedResult = 7.0;
        double actualResult = new Median().getMedian(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMedianEvenHP() {
        int[] arr = { 1, 2, 4, 7, 9, 10 };
        double expectedResult = 5.5;
        double actualResult = new Median().getMedian(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMedianOneHP() {
        int[] arr = { 10 };
        double expectedResult = 10.0;
        double actualResult = new Median().getMedian(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMedianEmpty() {
        int[] arr = {};
        double expectedResult = 0x80000000;
        double actualResult = new Median().getMedian(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMedianNull() {
        int[] arr = null;
        double expectedResult = 0x0.0000000000001P-1022;
        double actualResult = new Median().getMedian(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMedianOneMaxNumbers() {
        int[] arr = {2147483647, 2147483647, 2147483647, 2147483647};
        double expectedResult = 2147483647;
        double actualResult = new Median().getMedian(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
