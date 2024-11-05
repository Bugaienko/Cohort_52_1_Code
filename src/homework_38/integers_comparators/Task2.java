package homework_38.integers_comparators;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.11.2024
 */

/*
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
//[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur

 */

public class Task2 {
    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
//[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                boolean isFirstEven = int1 % 2 == 0;
                boolean isSecondEven = int2 % 2 == 0;

//                Четные целые числа должны идти перед нечетными числами
                // Т.е. при сравнении четного с не четным, четное должно признаваться "меньшим", чтобы оно располагалось левее

                // числа "разные" - одно четное, второе не четное
                // числа "одинаковые" -> сортировать в естественном порядке (определять кто больше)

                if (isFirstEven && !isSecondEven) { // первое четное, второе не четное -> первое число должно быть "меньше"
                    return -1;
                } else if (!isFirstEven && isSecondEven) { // Первое НЕ четное, второе четное -> второе число должно быть "меньше"
                    return 1;
                } else { // оба числа "одинаковые" - либо четные, либо не четные
                    return  Integer.compare(int1, int2);
                }
            }
        };

        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));

        /*
        Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

    Четные целые числа должны идти перед нечетными числами в порядке возрастания.
    Нечетные целые числа должны идти после четных в порядке убывания
         */

        Comparator<Integer> comparator1 = (int1, int2) -> {
            boolean isFirstEven = int1 % 2 == 0;
            boolean isSecondEven = int2 % 2 == 0;

            // Всего возможно 4 комбинации. Можно просто для каждой прописать логику сравнения
//            if (isFirstEven && isSecondEven) return int1 - int2;
//            if (isFirstEven && !isSecondEven) return -1;
//            if (!isFirstEven && isSecondEven) return 1;
//            if (!isFirstEven && !isSecondEven) return  int2 - int1;


            // Если оба четные - прямая сортировка. В порядке возрастная
            if (isFirstEven && isSecondEven) {
                return Integer.compare(int1, int2);
            } else if (isFirstEven ) { // первое четное, второе не четное -> четное должно быть меньше. Первое меньше
                return  -1;
            } else if (isSecondEven) { // первое нечет, второе четное -> первое должно быть больше
                return 1;
            } else { // оба не четные - сортировать в порядке убывания
                return Integer.compare(int2, int1);
            }
        };

        Arrays.sort(integers, comparator1);
        System.out.println(Arrays.toString(integers));


    }
}
