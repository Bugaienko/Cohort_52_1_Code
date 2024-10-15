package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

// Интерфейсы косвенно абстрактны. Нам не нужно писать ключевое слово abstract (оно присутствует по умолчанию)
public interface Printable {
    // Интерфейс - это совокупность абстрактных методов, задающих поведение

    // Все методы интерфейса косвенно и абстрактные, и публичные
    // public abstract
    void print();

    // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)
    default void test(){
        System.out.println("Test");
    }

    // Начиная с JDK8 доступны статические методы
    static void testStatic(String str) {
        System.out.println("Static method printable: " + str);
    }

    // c JDK 9 появились приватные методы (могут быть статические и нестатические).
    // Переопределить их в классе невозможно.
}
