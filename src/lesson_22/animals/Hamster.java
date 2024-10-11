package lesson_22.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.10.2024
 */

public class Hamster extends Animal {

    // Переопределим родительский метод
    @Override
    public void voice() {
        System.out.println("Hamster say Hrum-hrum");
    }
}
