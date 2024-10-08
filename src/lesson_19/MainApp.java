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

        // Но состояние объекта я менять могу
        car.setPowerPS(800);
        System.out.println(car.toString());


    }
}
