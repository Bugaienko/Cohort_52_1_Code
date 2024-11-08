package homework_41;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.11.2024
 */
/*
Task 1
Частотный словарь слов:

Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.


Task2
Опционально:
Напишите метод, возвращающий частотный словарь вхождения символов в строку

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
 */

public class Task1 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionaryWords(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println(frequencyDictionaryWords2(text));
        System.out.println(frequencyDictionaryWords3(text));
        System.out.println(frequencyDictionaryWords4(text));
    }

    private static Map<String, Integer> frequencyDictionaryWords(String text) {
        /*
        1. Поместить в какую-то коллекцию слова из текста
        2. Создать карту вхождений слов: -> слово : кол-во вхождений
        3. Перебирать слова.
            Проверить:
            Если уже есть слово-ключ в карте - обновить значение (староеЗначение + 1)
            Если слова нет - добавить новую пару слово-ключ + значение = 1
         */

        // Создаю массив слов
        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // Перебираю слова
        for (String word : words) {

            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            Integer amount = result.get(word);
            // Если такого ключа нет - вернет null

            // Если значения не было - присваиваю 0
            if (amount == null) {
                amount = 0;
            }

            // увеличиваю amount на 1.
            amount = amount + 1;

            // перезаписываю или записываю новую пару ключ-значение
            result.put(word, amount);

        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionaryWords2(String text) {

        // Создаю массив слов
        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // Перебираю слова
        for (String word : words) {

            // Пытаюсь получить значение, ассоциированное ключу "текущее слово"
            // Если такого ключа нет - вернет null
            // Если значения не было - присваиваю 0

            Integer amount = result.getOrDefault(word, 0);

           // перезаписываю или записываю новую пару ключ-значение
            result.put(word, ++amount);

        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionaryWords3(String text) {

        // Создаю массив слов
        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // Перебираю слова
        for (String word : words) {
            /*
            compute(K key, BiFunction<K,V)
            Метод compute позволяет вычислить новое значение для указанного ключа, используя функцию пересчета
            Новое значение может зависеть от текущего ключа и его значения
            Если функция вернет null - то запись удаляется из карты
             */

//            result.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            result.compute(word, (key, oldValue) -> {
                System.out.println("key: " + key + ", oldValue: " + oldValue);
                System.out.println("==================\n");
                if (oldValue == null) return 1;
                int newValue = oldValue + 1;
                return newValue;
            });
        }

        return result;
    }

    private static Map<String, Integer> frequencyDictionaryWords4(String text) {
        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // Перебираю слова
        for (String word : words) {

            /*
            merge(K key, V value, BiFunction<K, V>
            - Если ключ не существует (или ассоц c null) - будет добавлена новая пара ключ + value - значение указанное во втором параметре
            - Если ключ есть (ассоц. не с null) - применится функция пересчета,
            которая может использовать старое и новое значение (value) для вычисления
             */

            result.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);

//            result.merge(word, 1, Integer::sum);
        }

        return result;
    }
}
