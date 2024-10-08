package lesson_19;

import lesson_18.Car;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

public class MainApp {
    public static void main(String[] args) {

        FinalDemo finalDemo = new FinalDemo(50);

        FinalDemo finalDemo1 = new FinalDemo();

        final Car car = new Car("BMW", 200);

        // Мы не можем перезаписать ссылку, если переменная помечена как final
        // car = new Car("VW", 350);
        // car = null;

        // Но состояние объекта я могу изменить
        car.setPowerPS(800);
        System.out.println(car.toString());

        System.out.println(FinalDemo.PI);
        // Изменить значение константы не может ни один объект класса
        // FinalDemo.PI = 10.0;

        System.out.println(FinalDemo.COUNTRY.toUpperCase());
        System.out.println("Country: " + FinalDemo.COUNTRY);

        System.out.println("\n ================ \n");
        System.out.println("finalDemo.getPiX(): " + finalDemo.getPiX());


    }
}
