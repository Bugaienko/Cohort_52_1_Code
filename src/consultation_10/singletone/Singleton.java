package consultation_10.singletone;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Singleton {
    // Единственный экземпляр класса
    private static Singleton instance;

    // Приватный конструктор
    private Singleton() {

    }

    // Глобальная точка доступа к экземпляру
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
