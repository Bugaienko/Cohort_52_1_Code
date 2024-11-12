package homework_43;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.11.2024
 */
/*
Task 2
Дан список строк.

Используя Stream API,
отфильтруйте строки, которые начинаются на определенную букву (например, "A")
и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Опционально + удалите дубликаты из списка строк
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Abba", "apple", "Banana", "bank", "apply");
        String start = "a";
        char startChar = 'A';

        System.out.println(getStringStartWith(strings, start));
        System.out.println(getStringStartWith2(strings, startChar));

    }

    public static List<String> getStringStartWith(List<String> strings, String start) {
        String text = "Abcdef";
        // boolean startWith(String str) - проверяет, что строка начинается с указанной
        // boolean endWith(String str) - проверяет, что строка заканчивается с указанной
//        boolean res = text.startsWith("Abc"); // true
//        System.out.println("text.startsWith(\"Abc\"): " + res);
//        System.out.println("text.startsWith(\"abc\"): " + text.startsWith("abc")); // false
//        System.out.println(text.endsWith("ef")); // true
//        System.out.println(text.endsWith("f")); // true

        return strings.stream()
                .filter(str -> str.startsWith(start))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> getStringStartWith2(List<String> strings, char charStart) {
            return  strings.stream()
                    .filter(str -> str.startsWith(String.valueOf(charStart)))
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
    }
}
