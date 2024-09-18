package consultation_03;

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
public class HW05_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String string  = scanner.nextLine();

        int indexMiddle = string.length() / 2 - 1;

        // Option 1
        char ch1 = string.charAt(indexMiddle);
        char ch2 = string.charAt(indexMiddle + 1);
        System.out.println("" + ch1 + ch2);
//        System.out.println(second);

        // Option 2
        String subStr = string.substring(indexMiddle, indexMiddle + 2);
        System.out.println(subStr);
    }
}
