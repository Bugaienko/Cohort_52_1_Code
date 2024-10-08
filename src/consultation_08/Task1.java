package consultation_08;

import lesson_18.Car;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

public class Task1 {

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("VW", 150);
        cars[1] = new Car("Opel", 500);
        cars[2] = new Car("BMW", 300);

        Random random = new Random();

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("Car" + i, random.nextInt(101) + random.nextInt(101));
            System.out.println(cars[i]);
        }

    }
}
