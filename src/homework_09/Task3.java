package homework_09;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.09.2024
 */

/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. 
Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве. Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

public class Task3 {
    public static void main(String[] args) {
        
        int[] digits = new int[50];
        fillArray(digits);
        
        
        
    }

    public static void fillArray(int[] digits) {
        Random random = new Random();
        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(101);
        }
    }
}
