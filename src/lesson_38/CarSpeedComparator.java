package lesson_38;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.11.2024
 */

public class CarSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        /*
        car1 < car2 -> отрицательное
        car1 = car2 -> 0
        car1 > car2 -> положительное
         */

        // s1 = 100, s2 = 200
        // s1 - s2 - отрицательное -> car1 < car2
       //  s2 - s1 - положительное -> car2 < car1

        // от меньшего к большему
        return car1.getSpeed() - car2.getSpeed();

        // От большего значения к меньшему
//        return car2.getSpeed() - car1.getSpeed();
    }
}
