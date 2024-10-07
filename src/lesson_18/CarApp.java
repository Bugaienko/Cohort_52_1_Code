package lesson_18;

import homework_17.MagicArrayEncaps;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.10.2024
 */

public class CarApp {
    public static void main(String[] args) {


        System.out.println("Static before objects cars creating: ");
        System.out.println(Car.totalCarProduced);

        System.out.println(" ===================== \n");

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("VW", 300);
        System.out.println(car2.toString());

        System.out.println(car.toString());

        System.out.println("static var: " + Car.totalCarProduced);
        // Я могу обратится к статике, используя конкретный объект
        // Но это плохая практика. Нам следует обращаться к статике от имени класса.
        // System.out.println("static var: " + car2.totalCarProduced);

        // Я могу вызвать статический метод БЕЗ создания объекта (экземпляра) класса
        Car.testStatic();

        // Использование статических методов "утилитных" классов
        int sum = MathUtils.sumOfInts(25, 10);
        System.out.println("sum: " + sum);



    }
}
