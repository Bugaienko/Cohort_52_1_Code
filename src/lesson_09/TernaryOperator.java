package lesson_09;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.09.2024
 */

public class TernaryOperator {
    public static void main(String[] args) {

        int x = -5;

        String result;

        if (x >= 0) {
            result = "положительное";
        } else {
            result = "отрицательное";
        }

        // Тернарный оператор
        System.out.println("Число " + ((x >= 0) ? "положительное" : "отрицательное"));

        String res1 = (x >= 0) ? "положительное" : "отрицательное";

        System.out.println("Число " +res1);

    }
}
