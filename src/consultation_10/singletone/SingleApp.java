package consultation_10.singletone;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class SingleApp {
    public static void main(String[] args) {

        // Singleton singleton = new Singleton(); // Конструктор приватный. Невозможно создать объект, используя оператор new

        Singleton singleton = Singleton.getInstance();

    }
}
