package consultation_18;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.11.2024
 */

public class StreamOrderChange {
    public static void main(String[] args) {

        // unsorted() - указывает, что в потоке не обязательно сохранять порядок элементов
        // В основном имеет смысл в параллельных потоках

//        task1();

        task2();

        System.out.println("\n ============ Task 3 ================ \n");

        task3();


    }

    private static void task3() {
        List<String> strings = List.of("E1", "E22", "E3", "E2");

        Stream<String> stream = strings.stream()
                .filter(str -> {
                    System.out.println("filter: " + str);
                    return str.endsWith("2");
                })
                .map(str -> {
                    System.out.println("map: " + str);
                    return "_" + str;
                })
                .sorted((s1, s2) -> {
                    System.out.println("sorted: " + s1 + ": " + s2);
                    return s1.compareTo(s2);
                })
                ;

        stream.forEach(str -> System.out.println("forEach: " + str));

    }

    private static void task2() {
        List<String> strings = List.of("E1", "E22", "E3", "E2");

        Stream<String> stream = strings.stream()
                .filter(str -> {
                    System.out.println("filter: " + str);
                    return str.endsWith("2");
                })
                .map(str -> {
                    System.out.println("map: " + str);
                    return "_" + str;
                })
                ;

        stream.forEach(str -> System.out.println("forEach: " + str));

    }

    private static void task1() {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            sum += i;
            test(i);
        }

        System.out.println(sum);
    }

    private static void test(int n) {
        boolean res = n > 2;
    }
}
