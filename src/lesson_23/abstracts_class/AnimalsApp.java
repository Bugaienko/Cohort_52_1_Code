package lesson_23.abstracts_class;

/**
 * @author Sergey Bugaenko
 * {@code @date} 14.10.2024
 */

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.eat();
        cat.sayHello();

        // Нельзя создать экземпляр абстрактного класса
        // Animal animal = new Animal(); // Ошибка компиляции
        Animal animal = new Cat("Max"); // но я могу использовать полиморфизм.
        // Собирать объекты дочерних классов в ссылку родительского абстрактного класса

        Dog dog = new Dog("Pluto");
        dog.eat();
        dog.sayHello();

        SuperCow superCow = new SuperCow("Mu!");

        animalTest(superCow);

    }

    public static  void  animalTest(Animal animal) {
        animal.sayHello();
        animal.eat();
    }
}
