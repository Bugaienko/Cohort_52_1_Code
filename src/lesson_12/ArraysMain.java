package lesson_12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.09.2024
 */

public class ArraysMain {
    public static void main(String[] args) {



        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77 };
        System.out.println(ints.length);

        int index = ArraysUtils.linearSearch(ints, 100);
        System.out.println("index: " + index);



        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(ints));

        ArraysUtils.sortSelection(ints);

        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));

        // [0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99]
        int number = 87;
        int idx = ArraysUtils.binarySearch(ints, number);
        System.out.println("Индекс числа в массиве: " + idx);

        int[] testArray = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(10_001); // 0..10000
        }

        System.out.println("\n ================== \n");

        // ArraysUtils.sortSelection(testArray);
        Arrays.sort(testArray); // сортировка. Разберем позже

        number = 5000;
        idx = ArraysUtils.binarySearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (бинарный поиск): " + idx);

        idx = ArraysUtils.linearSearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (линейный поиск): " + idx);






    }
}
