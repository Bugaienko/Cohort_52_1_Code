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

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }
}
