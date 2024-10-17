package lesson_26.boxes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class SuperBoxString {
    private String value;

    public SuperBoxString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperBoxString{" +
                "value='" + value + '\'' +
                '}';
    }
}
