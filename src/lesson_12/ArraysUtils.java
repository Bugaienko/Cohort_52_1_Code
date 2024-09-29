package lesson_12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.09.2024
 */

public class ArraysUtils {

    // Метод линейного поиска элемента в массиве
    // Осуществляется перебором всех элементов и сравниванием с искомым значением
    // Если значений найдено - возвращается индекс элемента массива
    // Если не найдено - возвращается -1

    // Однозначно сказать, что число отсутствует в массиве?
    // Потребуется перебрать абсолютно все элементы массива -> O(n)
    // O(n)

    public static int linearSearch(int[] array, int searchValue) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == searchValue) {
                System.out.println("Линейный поиск нашел за: " + counter + " шагов");
                return i;
            }
        }
        System.out.println("Линейный поиск НЕ нашел. Потрачено шагов: " + counter);
        return -1;
    }

    // Метод ищет минимальное значение по всему массиву и возвращает индекс min значения

    public static int minIndex(int[] array) {
        int min = array[0];
            int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    // Метод ищет минимальное значение в части массива от стартового индекса и до конца массива
    // возвращает индекс min значения

    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Сортировка выбором
    /*
    Описания алгоритма сортировки:
    Выбирается минимальный элемент массива
    минимальное значение меняется местами с первым элементом
    Вторая итерация - выбирается мин элемент из оставшейся части массива
    меняется местами с первым из оставшихся.

     */


    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }

    public static int[] copyOfArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Бинарный поиск значения в массиве
    // [0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99]
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0; // 0
        int endIndex = array.length - 1; //12
        int middleIndex;

        int counter = 0;

        // Проверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex) { // 1. 0 <= 12

            counter++;

            // вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // Сравниваем значение в середине части массива с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }

            // Если значения не равны - определяем какую половину массива мы отбросим

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        // Если цикл while закончен (не осталось частей массива, которые можно поделить пополам)
        // значит искомое значение в массиве отсутствует

        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;
    }


}





































