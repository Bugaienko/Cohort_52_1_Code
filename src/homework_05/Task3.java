package homework_05;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.09.2024
 */


/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String string  = scanner.nextLine();

        int indexMiddle = string.length() / 2 - 1;

        char first = string.charAt(indexMiddle);
        char second = string.charAt(indexMiddle + 1);
        System.out.println(first);
        System.out.println(second);

        String subStr = string.substring(indexMiddle, indexMiddle + 2);
        System.out.println(subStr);
    }
}
