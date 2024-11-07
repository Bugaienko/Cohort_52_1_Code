package lesson_41;

import java.util.*;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.11.2024
 */

public class MapExample {

    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        System.out.println(strings.add("Hello"));
        strings.add("World");
        System.out.println(strings);

        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная. Не рекомендуется использовать

        // Конструктор. Создает пустую карту (мапу) емкостью 16 корзин.
        Map<Integer, String> map = new HashMap<>();

        // V put(K key, V value) - Добавление пару ключ-значение
        // Возвращает старое значение, соответсвующее ключу ранее. Если не было ключа - вернет null
        String oldValue = map.put(1, "Hello");
        System.out.println(oldValue);
        map.put(2, "World");
        map.put(3, "Java");


        // вернет null, так как в карте нет такого ключа = нет пары с ключом 4.
        System.out.println("map.put(4, Python): " + map.put(4, "Python"));
        System.out.println("map: " + map);
        // Ключ 4 уже есть в карте. Значит при попытке поместить в карту пару ключ (4) + значение.
        // Вернется значение, которое было ранее присвоено ключу (4)
        oldValue = map.put(4, "Orange");
        System.out.println("map.put(4, Orange): " + oldValue);

        System.out.println("map.put(4, \"Apple\"): " + map.put(4, "Apple"));

        System.out.println("map: " + map);

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(0, "Python");
        newMap.put(2, "New Value");
        System.out.println("newMap: " + newMap);

        // putAll - принимает карту и копирует все пары ключ значение из этой карты
        map.putAll(newMap);
        System.out.println("map: " + map);

        // boolean containsKey(Object key) - вернет true, если карта содержит указанный ключ
        // boolean containsValue(Object value) - вернет true, если карта содержит указанное значение (одно или несколько)
        System.out.println("map.containsKey(8): " + map.containsKey(8)); // такого ключа нет - false
        System.out.println("map.containsKey(1): " + map.containsKey(1)); // такой есть - вернется true
        System.out.println("map.containsValue(\"Java\"): " + map.containsValue("Java")); // такой значение есть - true
        System.out.println("map.containsValue(\"Orange\"): " + map.containsValue("Orange")); // такой значение есть - true
        System.out.println("map.containsValue(\"NoValue\"): " + map.containsValue("NoValue")); // такой значение есть - true

        System.out.println(map);
        System.out.println("\n ================ \n");

        // get(Object key) - возвращает значение по ключу. Если ключа нет - вернет null
        String value = map.get(3);
        System.out.println("map.get(3): " + value);
        System.out.println("map.get(100): " + map.get(100)); // ключа нет - вернет null




    }
}
