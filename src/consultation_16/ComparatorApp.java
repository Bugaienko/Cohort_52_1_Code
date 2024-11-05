package consultation_16;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.11.2024
 */

public class ComparatorApp {
    public static void main(String[] args) {

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);
        cars[5] = new Car("Ferrari", 2020, 330);


        Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.getYear(), car2.getYear()));

        printCars(cars);

        // Статический метод comparing используется для создания Компаратора.
        Comparator<Car> comparatorYear = Comparator.comparing(Car::getYear);
        Arrays.sort(cars, comparatorYear);

        printCars(cars);

        /*
        Comparator.naturalOrder() - естественном порядке (значение пол умолчанию)
        Comparator.reverseOrder() - компаратор, который сортирует в обратном порядке
         */
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));

        printCars(cars);

        // cars[0] = null;
        // Comparator.nullsFirst(Comparator.comparing(Car::getModel) - Обрабатывает null как наименьшее значение
        Arrays.sort(cars, Comparator.nullsFirst(Comparator.comparing(Car::getModel)));
        // Comparator.nullsLast(Comparator.comparing(Car::getModel) - Обрабатывает null как наибольшее значение
        Arrays.sort(cars, Comparator.nullsLast(Comparator.comparing(Car::getModel)));

        printCars(cars);

        // Дефолтные методы
//        1. reversed() - Возвращает обратный компаратор
//        2.thenComparing(Comparator other) - позволяет создавать цепочки компараторов для последовательного сравнения

        Arrays.sort(cars, Comparator.comparing(Car::getModel).reversed());
        printCars(cars);

        // Сортируем по модели, если модели совпали, то сортируем по году выпуска. В естественном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear));
        printCars(cars);

        // Сортируем по модели в естественном порядке, если модели совпали, то сортируем по году выпуска обратном порядке.
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        // Отсортировать по году выпуска в прямом порядке. Если год совпал, в порядке убывания максимальной скорости
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getSpeed, Comparator.reverseOrder()));
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getSpeed).reversed());
        printCars(cars);

        // Отсортировать машины по скорости в порядке убывания, если скорости одинаковые, то сортировать по возрастанию года
        Arrays.sort(cars, Comparator.comparing(Car::getSpeed, Comparator.reverseOrder()).thenComparing(Car::getYear));

        printCars(cars);






    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("==================== \n");
    }
}
