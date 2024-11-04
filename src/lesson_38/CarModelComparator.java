package lesson_38;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.11.2024
 */

public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        // String, Integer и все оберточные классы - реализуют интерфейс Comparable
        String model1 = car1.getModel();
        String model2 = car2.getModel();

        return model1.compareTo(model2);

        // String реализует по умолчанию лексикографическое сравнение строк
    }
}
