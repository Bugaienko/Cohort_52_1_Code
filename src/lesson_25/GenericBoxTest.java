package lesson_25;

import lesson_23.abstracts_class.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

// T - type; E - element, K - key, V - value
public class GenericBoxTest {
    private int value;

    public GenericBoxTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value= " + value +
                '}';
    }
}
