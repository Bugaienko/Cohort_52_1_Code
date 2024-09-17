package homework_05;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.09.2024
 */

public class Task4 {
    public static void main(String[] args) {
        String string = "Python is the best language";

        // Замените в строке string слово Python на слово Java
        // и сохраните результат в переменную string1
        // Выведите на экран string1

        String string1 = string.replace("Python", "Java");
        System.out.println(string1);


    }
}
