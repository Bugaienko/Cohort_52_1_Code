package homework_42;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.11.2024
 */

/*
Task 1
Напишите программу, которая проверяет,
являются ли две заданные строки анаграммами (то есть содержат ли они одинаковые буквы в разном порядке).

Инструкции:
Используйте HashMap<Character, Integer> для подсчета количества каждого символа в строках.
Сравните две карты, чтобы определить, являются ли строки анаграммами.

P.S.
Метод equals() для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение — независимо от порядка ключей.

Пример:
“listen” и “silent” — анаграммы.
“triangle” и “integral” — анаграммы.
“apple” и “papel” — анаграммы.
“hello” и “billion” — не анаграммы.
 */
public class Task1 {

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        // Проверяем, выводим результат
        if (areAnagrams(str1, str2)) {
            System.out.println("Строки являются анаграммой");
        } else {
            System.out.println("Строки НЕ являются анаграммой");
        }

    }

    public static boolean areAnagrams(String str1, String str2) {
        // Уберу пробелы и приведу к единому регистру.
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Если длины строк не равны, они не могут быть анаграммами
        if (str1.length() != str2.length()) return false;

        // Создам карты частот символов в обеих строках
        Map<Character, Integer> charCountMap1 = getCharFrequencyMap(str1);
        Map<Character, Integer> charCountMap2 = getCharFrequencyMap(str2);

        // Сравниваем карты
        return charCountMap1.equals(charCountMap2);

    }

    // Метод для создания карты частот символов
    private static Map<Character, Integer> getCharFrequencyMap(String str1) {
        Map<Character, Integer> map = new HashMap<>();

        // Пройтись по каждому символу
        for (Character ch : str1.toCharArray()) {
            // Обновляем счетчик символа
            Integer amount = map.getOrDefault(ch, 0);
            map.put(ch, amount + 1);
        }

        return map;
    }
}
