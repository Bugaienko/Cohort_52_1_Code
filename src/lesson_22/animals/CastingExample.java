package lesson_22.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.10.2024
 */

public class CastingExample {
    public static void main(String[] args) {

        Cat cat = new Cat();

        // Восходящее и нисходящее преобразование
        //

        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal
/*
        Тип ссылки определяет:
        1. Ссылки на объекты каких типов здесь могут хранится
        2. Какие методы мне доступны
 */
        animal.voice();

        // Такое присвоение / кастинг не допустимы. Т.к. Test не является потомком Animal;
        // Animal animal1 = new Test();

        Dog dog = new Dog();
        Animal animal2 = dog; // Неявное автоматическое преобразование ссылки тип Dog к типу Animal
        Animal animal3 = new Hamster();

        System.out.println("\n ==================== ");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        int i1 = 100;
        double d1 = i1;

        System.out.println(d1);

        double y = 10.50;
        int x = (int) y;

        Cat catLink;
        Animal animalLink = new Cat();
        // animalLink.eat(); на ссылке типа Animal метод eat() (из класса Cat) недоступен к вызову

        catLink = (Cat) animalLink; // Нисходящее ЯВНОЕ преобразование типа ссылки
        catLink.eat();

        System.out.println("\n ======= Down-casting============== ");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("sout: " + animals[i]);

            System.out.println(animals[i].getClass() + " instanceof Cat: " + (animals[i] instanceof Cat)); // проверяем, что ссылка может быть приведена к типу Cat

            Animal current = animals[i];

            if (animals[i] instanceof Cat) {
                System.out.println(i + "-й индекс может быть безопасно приведен к Cat");
                Cat tempCat = (Cat) current;
                tempCat.eat();
            }

            System.out.println("==============\n");
        }




    }
}
