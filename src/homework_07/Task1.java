package homework_07;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.09.2024
 */

/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)


 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число на выбор: 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
            case 4:
                System.out.println("Вы ввели три или 4");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }

        // Java 17 or higher - появились многострочные String
//        String string = """
//                Строка 1
//                Строка 2
//                Строка 3
//                """;
//        System.out.println(string);

        // JAVA 14 or higher
        /*
        switch (input) {
            case 1 -> System.out.println("Opt2: Вы ввели один");
            case 2 -> System.out.println("Opt2: Вы ввели два");
            case 3, 4 -> System.out.println("Opt2: Вы ввели три или 4");
            default ->  System.out.println("Opt2: Я таких чисел не знаю");
        }

        String result = switch (input) {
            case 1 -> "Opt3: Вы ввели один";
            case 2 -> "Opt3: Вы ввели два";
            case 3, 4 -> "Opt3: Вы ввели три или 4";
            default ->  "Opt3: Я таких чисел не знаю";
        };

        System.out.println(result);
         */







//        System.out.println("input: " + input);

//        System.out.println("Введите ваш возраст:");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("age: " + age);






    }
}
