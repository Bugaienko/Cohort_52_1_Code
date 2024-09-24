package homework_08;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.09.2024
 */
/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */

public class Task1 {
    public static void main(String[] args) {

        // Используем тип long, т.к. результат вычислений не помещает в тип данных int
        long mult = 1;

        int i = 1;
        while (i <= 15) {
            mult *= i++;
        }

        System.out.println("Произведение чисел: " + mult);


    }
}
