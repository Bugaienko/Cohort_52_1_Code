package homework_06;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.09.2024
 */

/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:

равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
 */

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(51); // [0, 1 ...49, 50]
        int b = random.nextInt(101); // [0..100]
        b = random.nextInt(51) -20; // [0...50] -> 0 -20 = -20; 20 - 20 = 0; 50 - 20 = 30; [-20...30]

        // 1-100 включительно. [0..99] + 1 -> [1..100]
        int rand = random.nextInt(100) + 1;
        rand = random.nextInt(); // во всем диапазоне типа int

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        boolean check = a == b;
        System.out.println(a + " == " + b + " -> " + check);

        check = a != b;
        System.out.println("a != b: " + check);

        check = a > b;
        System.out.println("a > b: " + check);

        check = b < a;
        System.out.println("b < a: " + check);
    }
}

















