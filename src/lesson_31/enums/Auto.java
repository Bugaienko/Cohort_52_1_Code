package lesson_31.enums;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.10.2024
 */

public class Auto {
    // Константа
    public static final String RED = "RED";

    private String model;
    // private String color;
    private Color color;

    public Auto(String model, Color color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color=" + color +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
