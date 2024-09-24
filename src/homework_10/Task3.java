package homework_10;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.09.2024
 */

/*
Task 3
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};

//        int[] primeArray = getArrayWithOnlyPrime(numbers);
//        System.out.println(Arrays.toString(primeArray));

        System.out.println(isPrime(10000019));
        System.out.println(isPrime2(10000019));
    }

    public static int[] getArrayWithOnlyPrime(int[] numbers) {

        // Считаем количество простых чисел
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }

        // Если простые числа не найдены = возвращаем пустой массив
        if (count == 0) return new int[0];

        // Создаю массив, где будут храниться только простые числа
        int[] result = new int[count];

        // Заполнить массив простыми числами
        for (int i = 0, idxPrime = 0; i < numbers.length && idxPrime < count; i++) {
            if (isPrime(numbers[i])) {
                result[idxPrime++] = numbers[i];
            }
        }

        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) return false;
        }

        System.out.println("Проверено делителей isPrime: " + count);
        return true;
    }

    public static boolean isPrime2(int number) {
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;

        if (number % 2 == 0 || number % 3 == 0) return false;

        int count = 2;


        for (int i = 5; i  <= Math.sqrt(number); i += 6) {
            count++;
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        System.out.println("Проверено делителей  isPrime V2: " + count);
        return true;
    }


}
