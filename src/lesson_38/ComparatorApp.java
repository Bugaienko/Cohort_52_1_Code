package lesson_38;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.11.2024
 */

public class ComparatorApp {
    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 2, 3, 0, 4};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abbb", "ABbb", "Cccc", "apple", "Zebra"};
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n ====================== \n");
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        Arrays.sort(cars, carSpeedComparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n=========");
        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n =========== Anonymous class ========= \n");

        // Анонимный класс
        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        // Сравнить машины по году в порядке возрастания,
        // если год совпадает - сравнить такие машины по модели в порядке убывания (обратный естественному)

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare == 0) {
                    // годы оказались равны
                    return c2.getModel().compareTo(c1.getModel());
                } else {
                    return yearCompare;
                }
            }
        });

        System.out.println(Arrays.toString(cars));

        // Функциональный интерфейс - интерфейс который имеет ровно один абстрактный метод

        // Лямбда-выражения - способ краткой записи анонимных функций.
        // Используются исключительно для реализации функциональных интерфейсов

        // (параметр) -> { тело выражения }

        // Когда реализация состоит из одного выражения, фигурные скобки не требуются
        // Ключевое слово return не используется. Результат выражения автоматически возвращается
        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());
        System.out.println(Arrays.toString(cars));

        // Когда появляется блок {} - я должен использовать return
        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed() - car2.getSpeed();
        });

        // if (условие) оператор
        // if (условие) {
        // оператор 1;
        // оператор 2;
        // оператор 3;
        // }

        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();

            // альтернативный способ сравнения двух int
            yearCompare = Integer.compare(yearCompare, c2.getYear());

            // если хотим использовать compareTo. (лучше так не надо)
            // Integer.valueOf(c1.getYear()).compareTo(Integer.valueOf(c2.getYear()));


            if (yearCompare == 0) {
                // годы оказались равны
                return c2.getModel().compareTo(c1.getModel());
            } else {
                return yearCompare;
            }
        });

        // Компаратор с использованием лямбда-выражение.
        // Отсортировать машины по году выпуска в порядке возрастания.
        // Если год совпадает - такие машины сортировать по скорости - в порядке возрастания.

        Comparator<Car> comparator = (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

            if (yearCompare == 0) {
                return Integer.compare(car1.getSpeed(), car2.getSpeed());
            }

            return yearCompare;
        };

        Arrays.sort(cars, comparator);

        System.out.println(Arrays.toString(cars));

        // Реализовать компаратор с использованием лямбда
        // для сортировки машин по году выпуска в обратном порядке
        // Если не получается - в прямом порядке по году выпуска

        /*
        v1 = 200, v2 = 100
        Машина с большей скоростью считалась "меньшей"
        (v1, v2) -> Если v1 считается меньше чем v2 - метод должен вернуть отрицательное значение
        v1 - v2 -> если скорость v1 меньше чем v2 - результат будет отрицательный,
        т.е. v1 будет признана меньше, чем v2
        v2 - v1 -> если скорость v1 меньше чем v2 -> результат будет положительный,
        т.е. v1 будет признана больше (т.к. результат положительный) v2

        (v1, v2) -> сравниваем
        v1 - v2 -> если v1 больше v2 -> результат положительный,
        т.е.  v1 будет признан большим, чем v2
        v2 - v1 -> если v1 больше чем v2 -> результат отрицательный,
        т.е. v2 признается большим


         */
        /*
       Сравнение по скорости. car1 vs car2
       1. Если мы хотим прямой порядок сортировки -> от меньшего к большему
       car1.getSpeed - car2
       car1.getYear - car2
       2. Порядок сортировки по убыванию
       car2.getSpeed - car1.getSpeed
       car2.getYear - car1.getYear
         */

        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());

        System.out.println(Arrays.toString(cars));

        // Todo Comparator - статические методы - покажу на консультации


        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        // Две альтернативы поменять порядок
        Arrays.sort(cars, Comparator.comparing(Car::getModel).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel));

        System.out.println(Arrays.toString(cars));









    }
}
