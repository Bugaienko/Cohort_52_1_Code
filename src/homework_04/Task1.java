package homework_04;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.09.2024
 */

/*
Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
 */

public class Task1 {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt;
        System.out.println(myDouble);

        // Hello "main"
        // Экранирование спец.символов
        System.out.println("Hello \"main\"");
    }
}
