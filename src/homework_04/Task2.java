package homework_04;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.09.2024
 */

/*
Task 2
Явное преобразование double в int
Напишите программу, которая:

Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        double myDouble = 5.99;
        int myInt = (int) myDouble;
        System.out.println(myInt);
    }
}
