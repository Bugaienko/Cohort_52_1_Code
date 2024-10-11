package homework_21.task2;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.10.2024
 */

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return "Component: " +  brand + " | " + model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
