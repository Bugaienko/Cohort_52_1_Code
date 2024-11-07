package consultation_17;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";



        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch : text.toCharArray()) {

            Integer count = result.get(ch);

            if (count == null) {
                count = 0;
            }

            result.put(ch, count + 1);

        }

        return result;

    }

}
