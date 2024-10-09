package homework_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 09.10.2024
 */

public class CalculatorApp {
    public static void main(String[] args) {

        double radius = 10.5;

        double area = Calculator_19.circleArea(radius);

        System.out.println("Area = " + area);

        System.out.println("Perimeter = " + Calculator_19.circlePerimeter(radius));
    }
}
