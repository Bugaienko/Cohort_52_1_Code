package lesson_19;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

/*
Класс Arrays предоставляет различные статические методы для работы с массивами.
 */

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};

        // Возвращает строковое представление массива
        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("\n ========= Сортировка массива ========== \n");
        Arrays.sort(array);

        // Сортировка части массива. От начального (включительно) до конечного (не включительно) индекса
//        Arrays.sort(array, 1, 3);
        System.out.println(Arrays.toString(array));

        System.out.println("\n ========= Бинарный поиск ========== \n");
        // binarySearch - массив должен быть отсортирован
        // Если значение не найдено, возвращает отрицательное число.
        int index = Arrays.binarySearch(array, 50);
        System.out.println("index: " + index);

        System.out.println("\n ========= Сравнение массивов на равенство  ========== \n");
        //           [0, 1, 2, 3]
        int[] test = {0, 2, 1, 3};
        //Мы не можем корректно сравнить массивы "по значению" методом equals
        System.out.println("array.equals(test): " + array.equals(test));
        // Для сравнения массивов по значениям используем Arrays.equals. Порядок значений учитывается при сравнении
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("Arrays.equals(array, test): " + isArraysEquals);

        // Находит и возвращает индекс первого различия между массивами
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test): " + mismatchIndex);

        System.out.println("\n============ Многомерные массивы ============");
        int[][] arrayD = new int[3][4];
        // Возвращает строковое представление массива, включая вложенные массивы
        System.out.println(Arrays.deepToString(arrayD));

        // Сравнение многомерных массивов
        int[][] arrayC = new int[3][4];
        boolean isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Arrays.deepEquals(arrayD, arrayC): " + isEquals);
        arrayC[0][3] = 1;
        arrayC[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));
        isEquals = Arrays.deepEquals(arrayD, arrayC);
        System.out.println("Arrays.deepEquals(arrayD, arrayC): " + isEquals);

        System.out.println("\n =========== copyOf =============");
        /*
        copyOf - Создает новый массив заданной длины. При этом копирует элементы из старого массива
        Кол-во копируемых элементов равно новой длине массива
        Если длина нового массива больше, чем старого - оставшиеся ячейки заполняются значениями по умолчанию для типа данных массива
         */

        System.out.println("testArray: " + Arrays.toString(test));

        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest));

        System.out.println("\n =========== copyOfRange =============");
        /*
        copyOfRange - Создает новый массив и записывает в него значение от индекса from до индекса to. Последний индекс не включается
         */
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Arrays.copyOfRange(ints, 3, 10): " + Arrays.toString(rangeFromInts));
        // Получить новый массив со значениями "старого массива" (копирование объекта)
        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length): " + Arrays.toString(copyOfInts));
        copyOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOfRange(ints, 0, ints.length): " + Arrays.toString(copyOfTest));

        System.out.println("\n =========== System.arraycopy =============");
        /*
        System.arraycopy - принимает 5 параметров
        Массив-донор (откуда мы берем значения)
        Индекс с которого мы берем значения
        Массив в который будут вставлены значения
        Индекс с которого начнут записываться значения
        Количество копируемых значений
         */

        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println(Arrays.toString(target));

        System.out.println("\n =========== fill =============");

        // Заполнение массива указанным значением
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 4, 1000);
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(101));
        System.out.println(Arrays.toString(arr));



    }
}
