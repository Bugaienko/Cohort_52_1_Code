package lesson_24.flyable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

public class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}
