package homework_20.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */

public class Shape {
    private String name;
    private String color;


    public void displayInfo() {
        System.out.println("Shape: " + name + ", color: " + color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
