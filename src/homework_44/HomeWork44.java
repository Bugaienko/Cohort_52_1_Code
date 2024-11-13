package homework_44;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.11.2024
 */
/*
Task 1
Из списка целых чисел выделите те значения,
которые больше 10;
отсортируйте эти значения по значению последней цифры в числе
и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список,
оставив только чётные числа,
затем каждое число умножить на 2,
и собрать результат в новый список
 */
public class HomeWork44 {

    public static void main(String[] args) {

//        task1(List.of(9, 17, 18, 22, 35, 5, 34, 55, 101, 203));
//
//        System.out.println("\nTask2");
//        task2(List.of("String", "Hello", "Java", "World", "LongString"));

        System.out.println("\nTask3");

        task3(List.of(9, 17, 18, 22, 35, 5, 34, 55, 101, 203));

    }

    public static void test(int i){
        i = i +2;
    }




    public static void task3(List<Integer> list) {

        List<Integer> result = list.stream()
                .filter(i -> i % 2 == 0)
                // 18, 22, 24
                .peek(System.out::println)
                .peek(i-> System.out.println(i+2))
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void task2(List<String> strings) {

        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
//                .min((s1, s2) -> s1.length() - s2.length());
                .min(Comparator.comparing(String::length));

        if (optionalString.isPresent()) {
            System.out.println("isPresent: " + optionalString.get());
        } else {
            System.out.println("Что-то пошло не так");
        }

        System.out.println(optionalString.orElse("что-то пошло не так (else)"));

        // ifPresent
        optionalString.ifPresent(string -> System.out.println("ifPresent: " + string));

        //ifPresentOrElse
        optionalString.ifPresentOrElse(str -> System.out.println("ifPresentOrElse: " + str), () -> System.out.println("Строк не найдено"));

    }

    public static void task1(List<Integer> list) {
        // 11, 6, 28
        // 6, 11, 28
        // 1, 6, 28
        list.stream()
                .filter(i -> i > 10)
//                .sorted((i1, i2) -> i1 % 10  - i2 % 10)
                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();


    }
}
