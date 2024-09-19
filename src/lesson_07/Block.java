package lesson_07;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.09.2024
 */

public class Block {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x: " + x);
            System.out.println("y: " + y);

        }


       //  x = x + y; // Ошибка компиляции. Переменная y не видна (не доступна) вне своего блока.
        // Новая переменная с именем y
        int y = 124;

    }
}
