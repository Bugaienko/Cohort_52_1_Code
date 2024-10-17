package lesson_26.boxes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class SuperBoxGen <T>{
    private T value;



    public SuperBoxGen(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperBox{" +
                "value=" + value +
                '}';
    }
}
