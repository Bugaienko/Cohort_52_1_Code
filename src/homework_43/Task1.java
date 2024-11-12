package homework_43;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.11.2024
 */

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
public class Task1 {

    public static void main(String[] args) {

    }

    public static List<Integer> getFilteredList(List<Integer> list) {
        return list.stream()
//                .filter(i -> i > 10 && i < 100 && i %2 ==0)
                .filter(i -> i > 10)
                .filter(i -> i < 100)
                .filter(i -> i % 2 ==0)
                .collect(Collectors.toList());
//                .toList(); // Java 17 or higher
    }
}
