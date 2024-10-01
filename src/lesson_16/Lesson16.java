package lesson_16;

import lesson_15.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 01.10.2024
 */

public class Lesson16 {
    public static void main(String[] args) {

        int x = 10;

        Cat catVar = new Cat();
       /*
       1. Создается новый объект типа Cat
       2. Вызывается конструктор для инициализации полей объекта.
        */

        catVar.whoAmI();

        System.out.println(catVar.name);

        catVar.name = "Jack";

        System.out.println(catVar.name);
        catVar.whoAmI();

        System.out.println(" ================== \n");

        Cat barsik = new Cat("Barsik", "grey", 3);
        barsik.whoAmI();
        System.out.println("name: " + barsik.name);
        System.out.println("color: " + barsik.color);
        System.out.println("age: " + barsik.age);
        barsik.age = 12;

        // Я могу создавать несколько объектов с одинаковыми значениями полей, если мне это нужно
        System.out.println(" ===================== \n");
        Cat cat1 = new Cat("Barsik", "grey", 3);
        cat1.whoAmI();

        Cat catClone = cat1;
        catClone.whoAmI();

        cat1.age = 100;
        cat1.whoAmI();
        catClone.whoAmI();
        System.out.println(catClone.age);
        catClone.name = "Max";

        catClone.whoAmI();
        cat1.whoAmI();

        System.out.println("============== Kratos");

        catClone = new Cat("Kratos", "black", 99);
        catClone.whoAmI();
        cat1.whoAmI();

         catClone = null; // если у ссылки на null попытаться вызвать метод - программа аварийно завершится в строке 64
        // NullPointerException. У null нельзя вызвать метод, присвоить значение полю и т.д.
        // Нет привязки к объекту.
        if (catClone != null) {
            System.out.println(catClone.name);
            catClone.whoAmI();
        }


    }
}
