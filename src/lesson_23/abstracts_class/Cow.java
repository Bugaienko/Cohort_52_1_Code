package lesson_23.abstracts_class;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.10.2024
 */

// Если наследник не переопределяет ВСЕ абстрактные методы родительского класса
// такой класс должен быть помечен как абстрактный
abstract class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cow eat");
    }
}
