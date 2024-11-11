package lesson_43;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.11.2024
 */

public class FunctionalInterfaces {
    public static void main(String[] args) {

        /*
        Consumer<T> - выполняет операцию над объектом типа T, не возвращая никакого результата
        void accept(T t)
         */

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String str) {

            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str);
        printConsumer.accept("Hello World");
        printConsumer.accept("Java");

        System.out.println("=============\n");

        // составной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        System.out.println("============= Predicate ===========\n");

        /*
        Predicate<T> - функция, которая принимает объект типа T и возвращает булевое значение.
        Проверка объекта на соответствие условию
        boolean test(T t) - абстрактный метод

        and() - логическое И (&&)
        or() - логическое ИЛИ (||)
        negate() - логическое отрицание НЕ (!)
         */

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        // Проверяет, что строка не пустая
        Predicate<String> isNotEmpty = str -> !str.isEmpty(); // если пустая строку - false, если не пустая - вернется true
        boolean result = isNotEmpty.test("Hello, World");
        System.out.println(result);
        System.out.println("isNotEmpty.test(\"\"): " + isNotEmpty.test(""));

        //  Метод, возвращающий список всех элементов, удовлетворяющих условию
        List<Integer> numbers = new ArrayList<>(List.of(-1, 3, 4, 10, -10, -45, 11 , 17, 24, 0, -8));

        // Список всеx отрицательных чисел
        List<Integer> res1 = filterByPredicate(numbers, i -> i < 0);
        System.out.println(res1);

        // Список всех положительных чисел
        List<Integer> res2 = filterByPredicate(numbers, i -> i >= 0);
        System.out.println(res2);

        // Список всех четных элементов (больше нуля и остаток от деления на 2 равен 0)
        List<Integer> res3 = filterByPredicate(numbers, i -> i > 0 && i % 2 == 0);
        System.out.println(res3);

        // and(Predicate<T>)
        Predicate<String> isLengthGreat6 = str -> str.length() > 6;
        Predicate<String> isContainsJava = str -> str.contains("Java");
        String test = "Java!";
        Predicate<String> combineString = isLengthGreat6.or(isContainsJava);
        System.out.println("combineString.test(test): " + combineString.test(test));

        Predicate<String> negate = isContainsJava.negate();
        System.out.println("negate.test(test): " + negate.test(test));


        System.out.println("\n ========= Function ==========\n");

        /*
        Function<T, R> - производит операцию над объектом типа T и возвращает результат типа R
        R apply(T t)
         */

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 0;
            }
        };

        Function<String, Integer> function = string -> string.length();
        int length = function.apply("Hello, World");
        System.out.println("function.apply(\"Hello, World\"): " + length);

//        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("Test string"));

        Function<String, String> concatenate = FunctionalInterfaces::test;
        String result1 = concatenate.apply("Hello, World");
        System.out.println(result1);

        Function<String, String> combine = toUpperCase.andThen(concatenate);
        System.out.println(combine.apply("Test string"));





    }

    public static String test(String str) {
        return str + "!!!";
    }

    public static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer integer : integers) {
            if (predicate.test(integer)) {
                result.add(integer);
            }
        }

        return result;
    }
}
