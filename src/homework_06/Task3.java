package homework_06;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.09.2024
 */

/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        boolean isEven = input % 2 == 0;
        boolean isDevByThree = input % 3 == 0;
        boolean isTwice = isEven && isDevByThree;



        System.out.println("Число: " + input +  " \nчетное: " + isEven +
                "; \nкратно 3: "+ isDevByThree+ "; \nчетное и кратное 3: " + isTwice);

        // printf()
        /*
        %d - целое число
        %f - число с плавающей точкой
        %s - строка
        %n - символ новой строки
        \n - универсальный символ новой строки
         */
        System.out.printf("Число: %d четное: %s ; кратно 3: %s; четное и кратное 3: %s\n", input, isEven, isDevByThree, isTwice);
        System.out.println("Test");

        // Печатает строку без добавления символа перевода строки
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");

    }
}
