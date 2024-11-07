package homework_40;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.11.2024
 */

/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

public class Task1 {

    public static void main(String[] args) {
        String testString = "Тестовая строка для  удаления слов,   которые повторяются. \"строка\" для удаления!";
        System.out.println("список уникальных слов: " + getUniqueSortedWords(testString));

        // System.out.println("  String string  ".trim());

    }

    private static List<String> getUniqueSortedWords(String testString) {

        /*
        1. Избавиться от знаков препинания
        2. Разбить на слова
        3. Поместить в какую-то коллекцию, которая мне обеспечит уникальность и сортировку
        4. Преобразовать в список и вернуть
         */

        // заменяю все не буквы и не пробелы на пустоту - удаляю из строки
        // trim() - убирает пробелы в начале и в конце строки -- "   String string  " -> "String string"
        testString = testString.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println("string: " + testString);

        // Разбить на слова по пробельному символу (в любом количестве)
        String[] words = testString.split("\\s+");
        System.out.println("array: " + Arrays.toString(words));

        // Конструктор может быть пустым, может принимать коллекцию или компаратор. Но не может одновременно принимать коллекцию+компаратор
//        Set<String> test = new TreeSet<>(Arrays.asList(words));

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        // Преобразую массив в список и передаю в метод addAll (в set будут добавлены все элементы из списка слов)
        // Сет обеспечит сортировку + удалит дубликаты
//        List<String> wordList = Arrays.asList(words);
        uniqueWords.addAll(Arrays.asList(words));
        System.out.println("set: " + uniqueWords);

        return new ArrayList<>(uniqueWords);
    }


}


