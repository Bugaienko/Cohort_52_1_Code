package homework_23.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

abstract class Shape {

    protected String type;

    public Shape() {
        this.type = "Shape";
    }

    public abstract double area();
    public abstract double perimeter();

    public String toString() {
        return type + " area: " + area() + ", perimeter " + perimeter();
    }
}
