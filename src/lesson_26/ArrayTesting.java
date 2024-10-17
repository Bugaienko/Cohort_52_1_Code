package lesson_26;

import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.10.2024
 */

public class ArrayTesting {
    public static void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();

        MyArrayList<Double> doubles = new MyArrayList<>();


        numbers.add(1, 2, 3, 4, 5, 6);

        System.out.println(numbers);

        System.out.println(numbers.indexOf(4));

        System.out.println(numbers.removeByValue(5));
        System.out.println(numbers);

        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Java");
        strings.add("Python", "JS", "Scala", "Kotlin");
        System.out.println(strings);

        System.out.println(strings.removeByValue("Basic"));
        System.out.println(strings.removeByValue("Scala"));
        System.out.println(strings);
    }
}
