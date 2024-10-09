package lesson_20.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 09.10.2024
 */

public class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }

    public String toString() {
        return model + ", year of manufacture is " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


}
