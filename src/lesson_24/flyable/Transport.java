package lesson_24.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public abstract class Transport {
    int capacity;
    int amount;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract boolean takePassenger();

    public int countPassenger() {
        return amount;
    }
}
