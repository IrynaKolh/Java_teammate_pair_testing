/*
   Написать метод, который принимает на вход массив целых чисел и возвращает медиану (серединное значение)

   Медианой называется число, стоящее в упорядоченном ряде чисел посередине.
   Например, в ряду: 1, 2, 3, 7, 9 — тройка является медианой. Если количество чисел чётное,
   то за медиану принимают среднее двух стоящих в центре чисел.
   Либо можно выбирать элемент под номером k/2, если k чётное и (k+1)/2, если нечетное.
*/

import java.util.Arrays;

public class Median {
    public int median(int[] numbers){
        if (numbers == null) {
            return Integer.MAX_VALUE;
        }
        if (numbers.length == 0){
            return Integer.MIN_VALUE;
        } else {
            Arrays.sort(numbers);
            int median;
            if (numbers.length % 2 == 0) {
                int middleIndex = numbers.length / 2;
                median = (numbers[middleIndex] + numbers[middleIndex - 1]) /2;
            } else {
                int middleIndex = numbers.length / 2;
                median = numbers[middleIndex];
            }
            return median;
        }

    }
}
