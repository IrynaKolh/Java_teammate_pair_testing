package median;/*
   Написать метод, который принимает на вход массив целых чисел и возвращает медиану (серединное значение)

   Медианой называется число, стоящее в упорядоченном ряде чисел посередине.
   Например, в ряду: 1, 2, 3, 7, 9 — тройка является медианой. Если количество чисел чётное,
   то за медиану принимают среднее двух стоящих в центре чисел.
   Либо можно выбирать элемент под номером k/2, если k чётное и (k+1)/2, если нечетное.
*/

import java.util.Arrays;

public class Median {
    public double getMedian(int[] numbers) {
        if (numbers == null) {
            return Double.MIN_VALUE;
        }
        int size = numbers.length;
        if (size == 0) {
            return 0x80000000;
        } else {
            Arrays.sort(numbers);
            if (size % 2 == 0) {
                long sum = (long)numbers[size / 2 - 1] + numbers[size / 2];
                return sum / 2.0;
            } else {
                return numbers[size / 2];
            }
        }

    }
}
