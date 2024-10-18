package homework_26.task3;

/**
 * @author Sergey Bugaenko
 * {@code @date} 18.10.2024
 */
/*
Task3 * Опционально
Обобщенный класс с ограничениями типов
Описание:

Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.

Метод double sum() возвращает сумму этих чисел.


Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */

public class NumericPair <T extends Number, E extends Number> {
    private T value1;
    private E value2;

    public NumericPair(T value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public Double sum() {
        return value1.doubleValue() + value2.doubleValue();
    }

}
