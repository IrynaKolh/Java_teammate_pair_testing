package median;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MedianTestLong {
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
        double expectedResult = 0x80000000;
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

//    @DataProvider(name = "validNumberArrayProvider")
//    public Object[][] validNumberArrayProvider() {
//        return new Object[][]{
//                {new int[]{1, 2, 3, 4}, 2.5},
//                {new int[]{-1, -2, -3, -4}, -2.5},
//                {new int[]{1, 3, 5}, 3.0},
//                {new int[]{5, 3, 2}, 3.0},
//                {new int[]{1, 2, 3, 4, 5, 6}, 3.5},
//                {new int[]{6, 5, 4, 3, 2, 1}, 3.5},
//                {new int[]{3, 1, 4, 1, 5, 9}, 3.5},
//                {new int[]{3, 1, 4, 1, 5}, 3.0},
//                {new int[]{-1, -2, -3, -4, -5}, -3.0},
//                {new int[]{2147483647, 2147483647, 2147483647, 2147483647}, 2147483647},
//                {new int[]{2147483647, 2147483647, 2147483647}, 2147483647},
//                {new int[]{2147483647}, 2147483647},
//                {new int[]{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}, 11.0},
//                {new int[]{1000000, 2000000, 3000001, 4000000, 5000000}, 3000001.0},
//                {null, 0x80000000},
//                {new int[]{}, 0x80000000},
//        };
//    }
//
//    @Test(dataProvider = "validNumberArrayProvider")
//    public void testFindMedianValidNumberArrayProvider(int[] input, double expected) {
//        double actual = new Median().getMedian(input);
//        Assert.assertEquals(expected, actual);
//    }
}
