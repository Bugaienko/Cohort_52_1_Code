package lesson_43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.11.2024
 */

public class StreamExample {

    public static void main(String[] args) {
        /*

         */

        task1();


    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Список, содержащий положительные числа
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (i > 0) result.add(i);
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);






    }

}
