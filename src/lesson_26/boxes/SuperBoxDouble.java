package lesson_26.boxes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class SuperBoxDouble {
    private double value;

    public SuperBoxDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperBoxDouble{" +
                "value=" + value +
                '}';
    }
}
