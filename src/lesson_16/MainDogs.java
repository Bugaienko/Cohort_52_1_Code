package lesson_16;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.10.2024
 */

public class MainDogs {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);

        String info = dog.info();

        System.out.println(info);

        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();

        System.out.println(dog.info());


    }
}
