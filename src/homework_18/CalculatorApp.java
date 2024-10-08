package homework_18;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

public class CalculatorApp {
    public static void main(String[] args) {

        int div = Calculator.divide(15, 3);
        System.out.println("div: " + div);

        double divDouble = Calculator.divide(10.0, 4);
        System.out.println("divDouble: " + divDouble);

        int sum = Calculator.add(1, 4, 5, 6, 8, 10);
        System.out.println("sum: " + sum);


    }
}
