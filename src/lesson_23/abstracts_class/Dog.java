package lesson_23.abstracts_class;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.10.2024
 */

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    void move() {
        System.out.println(name + " передвигается!");
    }

    @Override
    public void sayHello() {
        System.out.println(name + " says hello. Bark!");
    }
}
