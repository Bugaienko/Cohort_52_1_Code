package homework_10;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.09.2024
 */

public class ReturnExample {

    public static void main(String[] args) {
        sum(1.9, 2.0);

    }

    public static int sum(int a, int b) {
        if  (a > b) {
            return a + b;
        } else {
            return "String".length();
        }
    }

    public static void sum (double a, double b) {

        // Эмуляция проверки корректности входящих значений
        // Придумаем, что в ТЗ было написано, что метод должен считать сумму, только если a <= b
        if (a > b) {
            System.out.println("Error! a > b - с  такими значениями метод работать отказывается.");
            return;
        }

        double result = a + b;

        System.out.println("Метод sum double продолжает работу: " + result);

    }

}
