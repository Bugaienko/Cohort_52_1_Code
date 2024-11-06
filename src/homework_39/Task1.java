package homework_39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.11.2024
 */

/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

public class Task1 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5));
        List<Integer> integers1 = new LinkedList<>(List.of(3, 4, 5, 6, 5, 5, 6, 7, 8));
        System.out.println(intersection(integers, integers1));
        System.out.println(intersection(integers1, integers));

        List<String> strings = new ArrayList<>(List.of("a", "b", "c", "a"));
        List<String> strings1 = new LinkedList<>(List.of("a", "c", "d", "c"));
        System.out.println(intersectionGen(strings, strings1));
        System.out.println(intersectionGen(integers, integers1));

    }

    public static <T> List<T> intersectionGen(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }


    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.retainAll(list2);
        return result;
    }
}
