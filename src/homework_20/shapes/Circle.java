package homework_20.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */

public class Circle extends Shape {
    private double radius;



    public double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
