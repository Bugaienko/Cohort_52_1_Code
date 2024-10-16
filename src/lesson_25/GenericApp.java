package lesson_25;


/**
 * @author Sergey Bugaenko
 * {@code @date} 16.10.2024
 */

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> stringBox = new GenericBox<>("Hello");
        System.out.println(stringBox);


        stringBox.setValue("Hello World");
        System.out.println(stringBox);

       // Ошибка на этапе компиляции
       // GenericBox<String> stringBox2 = new GenericBox<>(25);



        // Дженерики работают только с объектами.
        // Т.е. мы можем использовать только ссылочные типы данных

       // GenericBox<int> box = new GenericBox<int>(15);
        GenericBox<Integer> box = new GenericBox<>(10);




    }
}
