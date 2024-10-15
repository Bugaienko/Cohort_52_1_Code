package homework_23.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.type = "Rectangle";
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB) * 2;
    }
}
