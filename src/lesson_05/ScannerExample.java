package lesson_05;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.09.2024
 */

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи ваше имя: ");
        String name = scanner.nextLine();



        // Прочитать целое число
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt(); // Считать одно число типа int
        scanner.nextLine(); // скушать остаток строки

        System.out.println("Введите ваш рост в см");
        double height = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);





    }
}
