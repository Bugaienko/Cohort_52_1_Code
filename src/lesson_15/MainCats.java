package lesson_15;

/**
 * @author Sergey Bugaenko
 * {@code @date} 30.09.2024
 */

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // создаем объект класса Cat
        // 1. Физически создается объект в памяти
        // 2. Вызывается конструктор класса для инициализаций свойств объекта (заполнение полей)


        cat.sayMeow();
        cat.run();
        cat.sleep();

        /*
        При создании объекта класса все его поля инициализируются значениями по умолчанию
        Для числовых примитивных типов -> 0 / 0.0
        boolean -> false
        Для всех ссылочных (в том числе String) -> null
         */


        String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println("Возраст: " + cat.age);

        System.out.println("================== \n");

        Cat cat1 = new Cat("Max");
        // Будет создан новый объект класса Cat
        // Имя (строка) которая была передана в конструкторе будет присвоено полю класса name

        System.out.println("Color: "  + cat1.color);
        System.out.println("Name: " + cat1.name);

        System.out.println(" ================== \n");
        Cat cat2 = new Cat("Diamond", "red");

        cat2.whoAmI();

        System.out.println("================== \n");
        Cat barsik = new Cat("Barsik", "white", 2);
        barsik.whoAmI();







    }
}
