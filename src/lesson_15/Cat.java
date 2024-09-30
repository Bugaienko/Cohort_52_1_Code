package lesson_15;

/**
 * @author Sergey Bugaenko
 * {@code @date} 30.09.2024
 */

public class Cat {
    String name;
    String color;
    int age;

    // Конструктор класса
    // Специальный тип метода.
    // Основная задача - установить начальные значения свойств объекта
    /*
    1. Имя конструктора совпадает с именем класса
    2. Конструктор не имеет возвращаемого типа.
    3. Конструктор вызывается автоматически при создании объекта.
     */
    // Перегрузка конструкторов

    public Cat(String catName) {
        name = catName;
    }

    // Конструктор по умолчанию.
    public Cat() {
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
        // Ключевое слово this используется внутри класса для ссылки на текущий объект
        // Оно поможет для разрешения конфликта имен между полями класса и параметрами методов / конструктов
    }

    public Cat(String name, String color, int age) {
        this(name, color); // вызов другого конструктора, должен быть первой строкой исполняемого кода
        // Вызываю конструктор класса, принимающий две стринги.
        // Соответсвующее поля будут проинициализированы
        // Ключевое слово this может быть использована для вызова других конструкторов класса
        // или для передачи текущего объекта в качестве параметра метода (разберем позже)

//        this.name = name;
//        this.color = color;
        this.age = age;
    }


    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void run() {
        System.out.println("Я бегу!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", this.name, age, color);
    }


}
