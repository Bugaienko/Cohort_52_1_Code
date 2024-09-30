package homework_14;

/**
 * @author Sergey Bugaenko
 * {@code @date} 30.09.2024
 */
/*
Task 2
Сумма четных чисел.
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(testArray));

    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE; // Хорошего решения на этой стадии нет. Компромиссный вариант
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }
}
