package homework_42;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.11.2024
 */
/*
Task 2
Подсчет слов по длине

Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).

Инструкции:
Используйте HashMap<Integer, Integer>, где ключом является длина слова, а значением — количество слов этой длины.

Прочитайте текст и обновите карту соответствующим образом.
Выведите результаты подсчета.
 */

public class Task2 {

    public static void main(String[] args) {
        String text = "Строка для подсчета слов с одинаковой длиной и вывода результата в консоль! Тест работы метода раз, два, три.";

        Map<Integer, Integer> wordLengths = countWordLengths(text);

        for (Map.Entry<Integer, Integer> entry : wordLengths.entrySet()) {
            System.out.println("Длина слова: " + entry.getKey() + ", количество слов: " + entry.getValue());
        }

    }

    public static Map<Integer, Integer> countWordLengths(String text) {
        Map<Integer, Integer> map = new HashMap<>();

        // Приведу текст к нижнему регистру, удалю не буквы (знаки препинания)
        text = text.toLowerCase().replaceAll("[^a-zа-яё ]", "");

        // Разбиваю текст на слова
        String[] words = text.split("\\s+");

        // Проходим по каждому слову, заполняем карту
        for (String word : words) {
            if (!word.isEmpty()){
                int length = word.length();

//                int count = map.getOrDefault(length, 0);
//                map.put(length, ++count);

                map.merge(length, 1, Integer::sum);
//                map.merge(length, 1, (old, newValue) -> old + 1);
            }
        }
        return map;
    }
}
















