package homework_04;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.09.2024
 */

/*
Task 3 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.


 */

public class Task3 {
    public static void main(String[] args) {
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("bigNumber: " + bigNumber);
        System.out.println("smallNumber: " + smallNumber);

        //Переполнения типа данных

        // Максимальное значение для типа данных байт
        byte b1 = 127;

        b1++; // b1 = b1 + 1;

        System.out.println(b1);
        b1--; // b1 = b1 -1
        System.out.println(b1);

        b1 = (byte) (b1 + 5);
        System.out.println(b1);

        // 127  + 1 = -128
        // -128 + 4 -> -124




















    }
}
